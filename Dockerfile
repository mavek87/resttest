FROM openjdk:8u275-buster
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT {"java", "-jar", "app.jar"}