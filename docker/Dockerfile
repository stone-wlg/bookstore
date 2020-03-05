FROM openjdk:8u242-jre-slim

COPY ./app.jar /app.jar
COPY ./application.yaml /application.yaml

ENTRYPOINT [ "java", "-jar", "/app.jar" ]
