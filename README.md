# Employee Management website

This project is a Java web application developed using Spring Boot that provides a comprehensive employee management system. It encompasses various features such as user authentication, connecting to a MySQL database, creating and managing employee records, and facilitating search and sorting functionalities. The application utilizes Spring Security for secure user authentication, Hibernate for database management, and Thymeleaf for rendering dynamic web pages. 

## Features

- User authentication and authorization (login/logout) using Spring Security.
- Connection to MySQL database and creation of employee records using Hibernate.
- Utilization of Thymeleaf as the view template for web pages.
- Data validation through Hibernate Validator, with form input errors displayed using Thymeleaf.
- CRUD (Create, Read, Update, Delete) operations for employee using JPA.
- Employee search and sorting functionalities.

## Demo website

Watch the demo video [here](https://youtu.be/rq_i9uxN4qc) to see the Employee Management Website in action.

## Prerequisites

Before running the application, ensure you have the following prerequisites:

- Java Development Kit 19 (JDK 19) installed.
- Maven build tool installed.
- MySQL database up and running, with appropriate credentials.
- Modern web browser to interact with the application.

## Installation and Usage

1. Create a Spring Initializr project named `EmployeeManagement`.
2. Clone this repository to your project.
3. Configure the database connection in the ***application.properties*** file. Replace the placeholders with your database credentials:
    
    `spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb?createDatabaseIfNotExist=true`

    `spring.datasource.username=your-username`

    `spring.datasource.password=your-password`
4. Build and run the application using Maven.
5. Open a web browser and access the application at address: `http://localhost:8080`

## Contributing
Contributions to this project are welcome! If you find any issues or want to add new features, please feel free to open a pull request.


---
🎉 Feel free to explore, modify, and use this Employee Management Website as needed. If you have any questions or need further assistance, please don't hesitate to reach out.


