FROM openjdk:8-jdk-alpine
MAINTAINER Tuong Vu
VOLUME /tmp
ADD /build/libs/*.jar docker-java.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /docker-java.jar
EXPOSE 8080