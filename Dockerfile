FROM openjdk:17

WORKDIR /spring

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /spring/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
