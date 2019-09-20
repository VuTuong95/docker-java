FROM java:8
MAINTAINER Tuong Vu
COPY ./build/libs/*.jar docker-java.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /docker-java.jar
EXPOSE 8080