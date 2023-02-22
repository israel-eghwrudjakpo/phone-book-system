FROM maven:3-openjdk-11 AS build
RUN mkdir -p .
WORKDIR .
COPY . .
RUN mvn clean package -DskipTests


FROM openjdk:11-jdk
COPY --from=build target/phonebooksystem-0.0.1-SNAPSHOT.jar /phonebooksystem-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/phonebooksystem-0.0.1-SNAPSHOT.jar"]