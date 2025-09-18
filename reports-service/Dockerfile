FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/reports-service-1.0.0.jar app.jar

EXPOSE 8092

ENTRYPOINT ["java", "-jar", "app.jar"]
