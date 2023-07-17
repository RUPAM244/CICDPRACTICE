FROM openjdk:8
ADD target/springboot-cicd-githubactions.jar springboot-cicd-githubactions.jar 
ENTRYPOINT ["java","-jar","/springboot-cicd-githubactions.jar"]