FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY build/libs/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
