# Maven Java Student App

A small console application to practise Maven JAR builds, Eclipse import, Jenkins and Docker.

## Requirements
- JDK 17
- Maven 3.9+
- Docker Desktop (for Docker practice)
- Jenkins with a JDK/Maven environment and Docker access (for pipeline practice)

## Run in Eclipse
1. File -> Import -> Maven -> Existing Maven Projects.
2. Select this folder and finish.
3. Right-click the project -> Run As -> Java Application -> `com.practice.Main`.

## Maven commands
```bash
mvn clean
mvn compile
mvn test
mvn package
mvn clean package
java -jar target/student-app-1.0.0.jar
```
The JAR is created inside `target/`.

## Docker commands
```bash
docker build -t student-app:1.0 .
docker images
docker run --rm student-app:1.0
```

## Jenkins
Create a Pipeline job, connect this Git repository, select `Jenkinsfile` from SCM, and run Build Now.
The agent must have Maven, Java 17 and Docker CLI/daemon access. If your Jenkins agent uses Windows, convert the `sh` commands to `bat`.

## Practise
- Change a student's marks and rebuild.
- Add another Student object.
- Change the JAR version in `pom.xml` and update the JAR path in the Dockerfile/Jenkinsfile.
- Intentionally enter an invalid Java statement and observe the failed Jenkins build.
