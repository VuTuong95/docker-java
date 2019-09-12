FROM openjdk:8
MAINTAINER Tuong Vu
ADD ./build/libs/*.jar docker-java.jar
EXPOSE 8080
CMD java -jar spring-boot.jar
