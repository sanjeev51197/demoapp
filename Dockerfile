FROM eclipse-temurin:17-jdk

COPY target/demoapp.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 9090

ENTRYPOINT [ "java", "-jar", "demoapp.jar" ]