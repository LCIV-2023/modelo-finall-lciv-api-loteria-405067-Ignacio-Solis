FROM openjdk:17-jdk-alpine
COPY target/lciii-scaffolding-0.0.1-SNAPSHOT.jar loteria.jar
ENTRYPOINT ["java","-jar","loteria.jar"]