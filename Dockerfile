FROM gradle:8.1.0-jdk17-alpine AS build
WORKDIR /app

COPY  . ./
RUN gradle build --no-daemon -x test

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/backend-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java" , "-jar", "/app/app.jar"]