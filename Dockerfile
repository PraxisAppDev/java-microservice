FROM openjdk:21-jdk-slim
EXPOSE 8080
COPY ./target/GetClientIp-*.jar /app/GetClientIp.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "GetClientIp.jar"]
