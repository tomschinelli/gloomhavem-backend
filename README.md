# Gloomhaven Backend

todo: generally explain everything more in detail. Right now this readme is only a collection of short notes

## Contributing

todo: explain in detail

Add feature:

```shell
git switch -c feature/{ISSUE_key}-short-description
# e.g.
git switch -c feature/ISSUE-1-setup-db-connection
```

Pull changes from main to feature:

```shell
# checkout your feature branch
# always use rebase to keept git history clean
git pull --rebase origin main
```

Always bring your changes to the main, via Pull-Requests. In th feature, the main branch will be protected:

When merging the PR, select *Squash and merge*

## Development Setup

### Requirements

- Gradle
- Java

### Run in intellij

Open the *Run Anything* window ith `ctrl + ctrl`.
Then type gradle. Now you get proposals for gradle tasks

### Clean Code and run Tests

```shell
# ! run always before committing
gradle spotlessApply check
```