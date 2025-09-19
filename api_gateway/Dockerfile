FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/gateway-1.0.0.jar app.jar

EXPOSE 8079

ENTRYPOINT ["java", "-jar", "app.jar"]
