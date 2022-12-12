FROM openjdk:8-jdk-alpine
RUN apk --no-cache add curl
RUN curl -u admin:Oussa@29392310 -o ExamThourayaS2.jar "http://172.20.10.6:8081/repository/maven-releases/tn/esprit/ExamThourayaS2/1.0/ExamThourayaS2-1.0.jar" -L
ENTRYPOINT ["java","-jar","/ExamThourayaS2.jar"]
EXPOSE 8089