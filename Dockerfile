FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD target/authorize-0.0.1-SNAPSHOT.jar authorize.jar

ENTRYPOINT ["java", "-jar", "authorize.jar"]