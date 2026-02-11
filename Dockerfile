# Stage 1: Build the Spring Boot application with Maven
FROM eclipse-temurin:8-jdk-jammy AS build
WORKDIR /app

COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x ./mvnw

#RUN ./mvnw dependency:go-offline

# Copy the entire application source code
COPY src/main/java src/main/java
COPY src/main/resources/applicationContext.xml src/main/resources/applicationContext.xml
RUN ./mvnw install

# Stage 2: Create the final Docker image with the built JAR
FROM openjdk:11-jre-slim
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/camel-aq-rabbitmq-demo-0.0.1-SNAPSHOT.jar .

CMD ["java","-jar", "/app/camel-aq-rabbitmq-demo-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:///app/properties/application.properties"]
