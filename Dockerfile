FROM openjdk:8-jdk-alpine
COPY /build/libs/my-text-0.0.1-SNAPSHOT.jar my-text.jar
ENTRYPOINT ["java", "-jar", "/my-text.jar"]