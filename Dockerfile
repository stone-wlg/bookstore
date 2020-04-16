FROM openjdk:8u242-jre-slim

COPY ./target/app.jar /app.jar
COPY ./target/classes/application.yaml /application.yaml
COPY ./docker-entrypoint.sh /docker-entrypoint.sh
RUN chmod 0755 /docker-entrypoint.sh

WORKDIR /

ENTRYPOINT [ "sh", "-c", "/docker-entrypoint.sh" ]
