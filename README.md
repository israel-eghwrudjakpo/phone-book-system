# Phone Book System Service

### Requirements

For building and running the application, you need:

* [Java 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
* [Maven 3](https://maven.apache.org/download.cgi)
* [MySQL 5.7.38](https://dev.mysql.com/downloads/mysql/)

### How to Run

* Clone this repository
* Make sure you are using Maven 3.x and JDK 11
* You can build the project by running ```mvn clean package```
* Once successfully built, you can run the service by spring boot plugin ```./mvnw -DskipTests spring-boot:run```
* You can run the service by running ```java -jar target/phonebooksystem-0.0.1-SNAPSHOT.jar```
* Once the application runs you should see something like this
```
2023-02-22 14:19:06.023  INFO 26317 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-02-22 14:19:06.107  INFO 26317 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.14.Final
2023-02-22 14:19:06.384  INFO 26317 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-02-22 14:19:06.574  INFO 26317 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-02-22 14:19:07.077  INFO 26317 --- [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2023-02-22 14:19:07.085  INFO 26317 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-02-22 14:19:08.772  INFO 26317 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-02-22 14:19:08.812  INFO 26317 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-02-22 14:19:08.825  INFO 26317 --- [  restartedMain] c.i.p.PhonebooksystemApplicationKt       : Started PhonebooksystemApplicationKt in 11.399 seconds (JVM running for 12.1)

```

### Deploying the Application using Docker
The easiest way to deploy the application is to use the docker
* [Install docker-compose](https://docs.docker.com/compose/install/)
* Start the application by running ```docker-compose up```

### About the Service
The service is just a simple Phone Contact REST service. It uses mysql database to store the data. If you start the service successfully, you can call some REST endpoints.<br />
Please refer to the swagger documentation on: ```/swagger-ui/index.html```
