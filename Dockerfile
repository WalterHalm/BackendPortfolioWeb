FROM amazoncorretto:8-alpine-jdk
MAINTAINER Walter Halm      
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar  SpringBoot-0.0.1-SNAPSHOT.jar   
ENTRYPOINT ["java","-jar","/SpringBoot-0.0.1-SNAPSHOT.jar"]                               
