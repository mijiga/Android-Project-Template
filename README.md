# Android-Project-Template

An Android Project Template for creating new Android Projects with out of the box setup for standard libraries and tooling(e.g code formatting, static code analysis, etc) built with Kotlin.

[![Default Workflow](https://github.com/mijiga/Android-Project-Template/actions/workflows/mainWorkflow.yml/badge.svg)](https://github.com/mijiga/Android-Project-Template/actions/workflows/mainWorkflow.yml)

## Tech Stack  
### Libraries
- Dagger-Hilt for dependency injection
- Firebase Analytics
- Firebase Crashlytics
- Firebase Perfomance
### Plugins
- Lint/Ktlint
- Detekt for static code analysis

## Documentation
* Pull request template: Defines a basic structure for you Pull Requests to get the most information from your Pull Requests. [See here](https://github.com/mijiga/Android-Project-Template/blob/460ce1bf4c46e88883abfbf1e886a7003a14e508/.github/pull_request_template.md)
* Issue report template: Defines a basic structure for your Issue reports so as to get comprehensive Issue Reports.
    * [Bug report](https://github.com/mijiga/Android-Project-Template/blob/460ce1bf4c46e88883abfbf1e886a7003a14e508/.github/ISSUE_TEMPLATE/bug_report.md)
    * [Feature Request](https://github.com/mijiga/Android-Project-Template/blob/460ce1bf4c46e88883abfbf1e886a7003a14e508/.github/ISSUE_TEMPLATE/feature_request.md)
    * [Engineering Task](https://github.com/mijiga/Android-Project-Template/blob/460ce1bf4c46e88883abfbf1e886a7003a14e508/.github/ISSUE_TEMPLATE/engineering-task.md)

## File Structure

## CI Workflow
The Github Actions Continuous Integration workflow is exectuted on every Pull Request or Push to the Main branch.
The workflow has the following jobs:
- Ktlint and Lint check job
- Test job: runs the project's tests
- Assemble job: builds the project

## Author
Steve Chikwiri
## License

