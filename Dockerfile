FROM java:8

EXPOSE 8090

ADD target/springbootk8-0.0.1-SNAPSHOT.jar springbootk8-demo.jar

ENTRYPOINT ["java", "-jar", "springbootk8-demo.jar"]
