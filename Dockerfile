FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} my-text.jar
ENTRYPOINT ["java", "-jar", "/my-text.jar"]