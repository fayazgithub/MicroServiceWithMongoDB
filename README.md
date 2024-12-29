# MongoMicroservice
 MongoDB Microservice

 @ -0,0 +1,64 @@
Simple Microservice
----------------------

End Point :  /demoservice
Local URL :  http://localhost:8080/demoservice
Response    : {
                "resourceid":"",
                "firstname":"",
                "lastname":"",
                "phone":"",
                "address":"",
                "city":"",
                "country":"",
                "zipcode":""
              }

------------------
Package Structure
------------------
    >>com.microservice.demoservice
         >>controller
                DemoServiceController
         >>model
                DemoServiceModel
         >>service
                DemoService
         DemoServiceApplication

JAR File
    target/mongodb-microservice-1.0.jar

--------------------
Maven Configurations
--------------------
1) Dependency - spring-boot-starter-web

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

2) Mongo Dependency

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-mongodb</artifactId>
        </dependency>

2) Springboot Starter Parent Module

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.1.2</version>
        <relativePath/>
    </parent>

 3.   Java Version
          <properties>
            <java.version>17</java.version>
          </properties>

 4. Maven Plugin Configuration
             <plugin>
                 <groupId>org.apache.maven.plugins</groupId>
                 <artifactId>maven-compiler-plugin</artifactId>
                 <configuration>
                     <source>${java.version}</source>
                     <target>${java.version}</target>
                 </configuration>
             </plugin>
