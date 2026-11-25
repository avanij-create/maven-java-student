FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/student-app-1.0.0.jar app.jar
CMD ["java", "-jar", "app.jar"]
