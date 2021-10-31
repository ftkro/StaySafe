# StaySafe

A web application that record check-in(out) for isolation apartment. When patient checks in, it will record the patient's room number, check-out(in) date, food preferences and other information. When checked out, all information will be deleted and the room will be marked as need cleaning. The advantage of such application is that it can find the patient's checkin information faster and edit the information quickly. When there are many patients, using the application will be more efficient than entering the form manually.


## Code Quality Analysis Result
[![CodeQL](https://github.com/ftkro/StaySafe/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/ftkro/StaySafe/actions/workflows/codeql-analysis.yml)
[![CodeFactor](https://www.codefactor.io/repository/github/ftkro/staysafe/badge)](https://www.codefactor.io/repository/github/ftkro/staysafe)
[![Lint Code Base](https://github.com/ftkro/StaySafe/actions/workflows/superlinter.yml/badge.svg)](https://github.com/ftkro/StaySafe/actions/workflows/superlinter.yml)
[![Java CI](https://github.com/ftkro/StaySafe/actions/workflows/maven.yml/badge.svg)](https://github.com/ftkro/StaySafe/actions/workflows/maven.yml)
## Proposed policy
From Takuro
- Use GitHub Actions to perform automated code analysis
- Use GitHub Actions to build, test, cache and possibly deploy artifact automatically
- Do not commit file to main branch, but use pull request otherwise discussed (Unless initial few steps)
- Do not commit too much as it will increase repo size and bombarding my mailbox plus I might have to pay overage fee for GitHub Actions.
- Do not commit > 10 MB file. If it is truly necessary, use Git LFS.
- Use GPG sign during commit process, if you familiar with it

TBC
