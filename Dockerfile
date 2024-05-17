FROM openjdk:21-jdk-slim
EXPOSE 5000
COPY ./target/GetClientIp-*.jar /app/GetClientIp.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", GetClientIp.jar"]
