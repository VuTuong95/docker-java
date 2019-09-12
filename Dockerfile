FROM openjdk:8
MAINTAINER Tuogn Vu
ADD /build/libs/*.jar app-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java -jar spring-boot.jar
