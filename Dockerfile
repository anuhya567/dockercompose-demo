FROM openjdk:17-alpine
ARG JAR_FILE=target/demo-1.1-SNAPSHOT.jar
COPY target/demo-1.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","demo.jar"]
#docker build -t anuhyac/demo:1.1 .