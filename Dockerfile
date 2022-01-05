# base image
FROM openjdk:8-jdk-alpine

# set agument
ARG JAR_FILE=target/*.jar

# copy artifact
COPY ${JAR_FILE} app.jar

# run
ENTRYPOINT ["java","-jar","/app.jar"]
