FROM openjdk:17-jdk-slim
VOLUME /tmp
ARG JAR_FILE=app.jar
RUN echo ${JAR_FILE}
COPY build/libs/${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
