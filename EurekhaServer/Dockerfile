# Stage 1: Build with Maven (inside Docker)
FROM maven:3.8-openjdk-17 AS builder
WORKDIR /app
# Copy ALL source code
COPY pom.xml .
COPY src ./src
# Maven builds INSIDE Docker container
RUN mvn clean package -DskipTests

#-------------------------------------
# Stage 2: Runtime (small image)
FROM openjdk:17-jre-slim
WORKDIR /app
# Copy ONLY the built JAR from builder stage
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8761
CMD ["java", "-jar", "app.jar"]