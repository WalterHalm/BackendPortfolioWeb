FROM amazoncorretto:8-alpine-jdk
MAINTAINER Walter Halm      
copy SpringBoot/target/SpringBoot-0.0.1-SNAPSHOT.jar  SpringBoot-0.0.1-SNAPSHOT.jar   
entrypoint["java","-jar","/SpringBoot-0.0.1-SNAPSHOT.jar"]                               
