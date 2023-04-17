# Gloomhaven Backend


## Deploy to container registry
Simply create a new tag. 
**This may be changes in the future.**

```shell
tag=0.x.x
git tag -a $tag -m "Create Release $tag"
git push --tags
```
### Run deployment locally
```shell
docker run ghcr.io/tomschinelli/gloomhaven-backend:0.0.3   
docker run -p 80:8080  ghcr.io/tomschinelli/gloomhaven-backend:0.0.3

# run health check
curl localhost:8080/actuator/health
 
# ❯ curl localhost:8080/actuator/health
# {"status":"UP"} 
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