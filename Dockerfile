FROM openjdk:15
EXPOSE  8081
COPY . .
ADD target/jenkinsOne.jar jenkinsOne.jar
ENTRYPOINT ["java", "-jar", "jenkinsOne.jar"]