# Analytics Micro Service Blueprint

This is a blueprint project and should be used as a template for real implementations.
This project is a Spring Boot project. The dependencies are managed with Maven.


The tasks have been performed: 

## 1. Git

Check out the source code from this git repository: 

```
https://github.com/vikasjaiswal24/analytics-ms.git
```

## 2. Install dependencies

Take a look at the project and install all the dependencies with the package manager which is used in the project. 

## 3. IDE

Create meta files for your desired IDE through the package manager.

## 4. Open the project in an IDE

Open the project in your favorite IDE. Your favorite IDE is either Eclipse or IntelliJ IDEA. 

## 5. Compile 

Compile the project with mvn. If it doesn't compile, fix it! 

## 6. Package 

Package the project into a JAR file, without running the tests. 

```
mvn clean install -DskipTests
```

## 7. Run 

Run the JAR file. If the application doesn't come up correctly, fix it!

```
java -jar analytics-ms-0.0.1-spring-boot.jar
```

Install Docker if not present on your system.

```
sudo snap install docker
```

The application has a dependency to MongoDB. Make sure that a MongoDB instance is running. 
If that is not the case, you can start a MongoBD Docker Container with this command: 

```
docker run --name mongodb -p 27017:27017 -p 28017:28017 -d versioneye/mongodb:3.4.6
```

Note: If the docker image "versioneye/mongodb:3.4.6" is not present on your system, the above command will download the image from docker hub.

OUTPUT:
```
f8742e4ac86c: Pull complete 
fad21889c9c0: Pull complete 
7af027f540f4: Pull complete 
eac7a0c45369: Pull complete 
Digest: sha256:29a4ce9c6ee5a662984bbb2bcb5f4969c06eeb52aca85bb0749128d954411bb3
Status: Downloaded newer image for versioneye/mongodb:3.4.6
```

You don't have to use MongoDB in Docker. If you have MongoDB already installed natively, 
you can use that installation as well. 
After you fixed the application and make it run successfully, 
you can reach it in the browser under `http://localhost:8080`. 
There are 2 Endpoints available: 

 - `http://localhost:8080/logs`
 - `http://localhost:8080/logs/count`

## 8. Extend - Create 

Add another Endpoint which is available under `http://localhost:8080/logs/` through HTTP POST. 
The Endpoint should accept a JSON payload in the HTTP Body, build a `Log` Model out of it 
and create a new entry in the database. In the case of success, this Endpoint should return the newly created ID 
of the submitted Entity. 

You can use Postman to build and fire an HTTP POST Request. 

## 9. Extend - Get By ID

Add another Endpoint which is available under `http://localhost:8080/logs/{id}`. 
The last part should be the primary ID of the Log entity in the database. 
The Endpoint should load the corresponding object from the database and 
return it's JSON representation via HTTP Response. 

## 10. Extends - Update

Build another Endpoint which alows the manipulation of an existing Entity. Choose the URI path 
by yourself and follow the best practices of REST APIs. 

## 11. Extend - Scheduler

There is a class `ScheduledTask` with the method `runBackgroundJob()`. 
Configure the application that way, that the method is executed every 5 seconds in the background. 

## 12. Build the Docker image

Build a Docker image with the application in it and call it `mycom/spring:0.0.1`. 

## 13. Run Docker

Run the Docker container that way that the application is available under `http://localhost:8080` on the Host system.
