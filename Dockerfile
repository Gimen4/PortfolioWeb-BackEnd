
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:17
MAINTAINER MGW
COPY target/mgb-0.0.1-SNAPSHOT.jar  mgb-app.jar
//COPY target/SpringBoot-0.0.1-SNAPSHOT.jar  mgb-app.jar
ENTRYPOINT  ["java","-jar","/mgb-app.jar"]
