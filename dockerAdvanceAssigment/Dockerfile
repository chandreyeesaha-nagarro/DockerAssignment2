# Stage 1: Build the application with a minimal Maven image
FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B  # Download dependencies to cache them
COPY src/ ./src/
RUN mvn clean package -DskipTests

# Stage 2: Create a lightweight image to run the application
FROM openjdk:17-slim
WORKDIR /app
COPY --from=build /app/target/dockerLearn-0.0.1-SNAPSHOT.jar app.jar

# Add a non-root user for better security
RUN useradd -m springuser
USER springuser

# Ensure the application runs with the least privilege
ENTRYPOINT ["java", "-jar", "app.jar"]
