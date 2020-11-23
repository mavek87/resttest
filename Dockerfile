FROM openjdk:8-slim
EXPOSE 7000
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD["java", "-jar", "app.jar"]