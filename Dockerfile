# ===== Build Stage (Optional) =====
# Use this if you want Docker to build the JAR inside container (can skip if you already have JAR)
# FROM gradle:8.10.2-jdk17 AS builder
# WORKDIR /app
# COPY . .
# RUN ./gradlew clean bootJar --no-daemon

# ===== Runtime Stage =====
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the pre-built Spring Boot JAR from your local build/libs folder
COPY build/libs/college-management-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app uses
EXPOSE 9090

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
