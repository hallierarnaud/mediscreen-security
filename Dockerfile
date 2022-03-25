FROM openjdk:11
COPY ./build/libs/Mediscreen-security-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar", "Mediscreen-security-0.0.1-SNAPSHOT.jar"]
