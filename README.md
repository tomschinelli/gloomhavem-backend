# Gloomhaven Backend


## Deploy to container registry
Simply create a new tag. 
**This may be changes in the future.**

```shell
tag=0.x.x
git tag -a $tag -m "Create Release $tag"
git push --tags
```

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

### Run application locally

```shell
gradle bootRun --args='--spring.profiles.active=local'    
```