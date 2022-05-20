FROM docker.io/openjdk:latest
COPY sender-2.0.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
