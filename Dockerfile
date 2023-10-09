From openjdk
LABEL maintainer = "abc@gmail.com"
EXPOSE 8081
WORKDIR /app
COPY target/spring-boot.jar /app/spring-boot.jar
ENTRYPOINT ["java", "-jar", "spring-boot.jar"]