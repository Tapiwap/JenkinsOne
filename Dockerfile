FROM openjdk:15
EXPOSE  8081
#COPY . .
COPY target/jenkinsOne.jar jenkinsOne.jar
ENTRYPOINT ["java", "-jar", "jenkinsOne.jar"]