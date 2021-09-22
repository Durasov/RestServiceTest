# RestServiceTest

# Run
If you use Maven, you can run the application by using 
`./mvnw spring-boot:run`

Alternatively, you can build the JAR file with 
`./mvnw clean package`

And then run the JAR file, as follows:
`java -jar target/RestServiceTest-1.0.jar`

# Test the Application
Now that the application is running. You have two HTTP endpoints that you can test:
GET `localhost:8080/` : Welcome page. 
GET `localhost:8080/api/personContacts` : Gets all people contacts.
