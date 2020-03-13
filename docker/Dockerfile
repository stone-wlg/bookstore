FROM openjdk:8u242-jre-slim

COPY ./app.jar /app.jar
COPY ./application.yaml /application.yaml

ENTRYPOINT [ "java", "-Dcom.sun.management.jmxremote=true", "-Dcom.sun.management.jmxremote.port=7190", "-Dcom.sun.management.jmxremote.rmi.port=7190", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.ssl=false", "-Dcom.sun.management.jmxremote.local.only=false", "-jar", "/app.jar" ]
