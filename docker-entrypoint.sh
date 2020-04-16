#!/usr/bin/env sh

JAVA_OPTS="${JAVA_OPTS} ${JAVA_AGENT}"

java ${JAVA_OPTS} -jar /app.jar
