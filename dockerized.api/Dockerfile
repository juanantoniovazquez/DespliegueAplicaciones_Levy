#FROM alpine:latest

#CMD ["/bin/sh"]

FROM openjdk:21-jdk
COPY target/dockerized.api-0.0.1-SNAPSHOT.jar helado-api.jar
ENTRYPOINT ["java", "-jar", "helado-api.jar"]