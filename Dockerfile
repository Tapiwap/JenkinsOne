FROM openjdk:15
EXPOSE  8081
COPY . .
ADD ../target/*.jar jenkinsOne.jar
ENTRYPOINT ["java", "-jar", "jenkinsOne.jar"]