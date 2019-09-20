FROM gradle:4.4.1-jdk8-alpine
MAINTAINER Tuong Vu
RUN gradle build
FROM openjdk:8
VOLUME /tmp
ADD /build/libs/*.jar docker-java.jar
COPY ./build/libs/*.jar docker-java.jar
EXPOSE 8080