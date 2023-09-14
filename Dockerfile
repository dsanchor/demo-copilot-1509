# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the packaged Spring Boot app to the container at /app
COPY target/demo1409*.jar /app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the Spring Boot app when the container launches
CMD ["java", "-jar", "app.jar"]