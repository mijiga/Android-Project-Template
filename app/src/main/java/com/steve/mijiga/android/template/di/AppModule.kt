package com.steve.mijiga.android.template.di

import android.content.Context
import com.google.gson.GsonBuilder
import com.steve.mijiga.android.template.api.AppAPI
import com.steve.mijiga.android.template.utils.Constants.BASE_URL
import com.steve.mijiga.android.template.utils.Constants.MAX_CACHE_SIZE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesRetrofit(@ApplicationContext context: Context): AppAPI {
        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
            .client(
                OkHttpClient()
                    .newBuilder()
                    .cache(Cache(File(context.cacheDir, "offlineCache"), MAX_CACHE_SIZE))
                    .addInterceptor(
                        HttpLoggingInterceptor().apply {
                            level = HttpLoggingInterceptor.Level.BODY
                        }
                    )
                    .build()
            )
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
        return retrofit.create(AppAPI::class.java)
    }
}
