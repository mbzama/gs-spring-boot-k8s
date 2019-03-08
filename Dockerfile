FROM openjdk:8-jdk-alpine
VOLUME /tmp

COPY target/gs-spring-boot-docker-1.0.jar gs-spring-boot-docker-1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gs-spring-boot-docker-1.0.jar"]