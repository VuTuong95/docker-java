FROM openjdk:8
COPY ./build/libs/app-0.0.1-SNAPSHOT.jar spring-boot.jar
EXPOSE 8080
CMD java -jar spring-boot.jar
