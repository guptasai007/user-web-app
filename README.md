# user-web-app
 Spring Boot web-application for CRUD operations around Users.
 
An easy-to-use web app is created for the purpose of CRUD operations around User objects. The fields for the User object are as mentioned in the assignment requirements doc, that are User ID, First Name, Last Name, DoB, City, Mobile Number. This app allows to read all the users currently existing in the database, add new user, update existing user and delete existing users. As asked the data is being stored in a persistent database (hosted on AWS cloud), and regains all user information once service is stopped and restarted. The application is deployed on AWS cloud and is available on the internet.
 
Technical Stack: 
1.	Backend: Java 11, Spring Boot, Spring MVC, Spring Data JPA (Hibernate ORM).
2.	Frontend: HTML5, CSS3, JavaScript, jQuery, Bootstrap5, Thymeleaf as the Spring Boot Templating engine.
3.	Database: MS SQL Server hosted in Amazon RDS (AWS).
4.	Application hosting: AWS Elastic Beanstalk for bootstrap deployment process (which internally created EC2 compute, S3 storage instance etc.)
