# Use a base image with Java 17
FROM openjdk:17-oracle

# Simply the artifact path
ARG artifact=target/spring-boot-hello-world-1.0.jar

WORKDIR /opt/app

COPY ${artifact} app.jar

# This should not be changed
ENTRYPOINT ["java","-jar","app.jar"]
