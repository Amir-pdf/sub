# Schritt 1: Projekt im Container mit Java 25 bauen
FROM eclipse-temurin:25-jdk-jammy AS build
WORKDIR /app
COPY . .
# Ausführungsrechte für den Maven Wrapper vergeben
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Schritt 2: Fertige JAR-Datei mit Java 25 ausführen
FROM eclipse-temurin:25-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]