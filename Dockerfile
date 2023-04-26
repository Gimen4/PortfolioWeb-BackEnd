
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:17
MAINTAINER gimenawilfinger
COPY target/mgb-deploy-0.0.1-SNAPSHOT.jar mgb-deploy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/mgb-deploy-0.0.1-SNAPSHOT.jar"]

CMD ["/bin/sh"]