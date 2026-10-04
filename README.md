# Notes Management System

A backend REST API application built with Java and Spring Boot for managing notes with full CRUD functionality and SQL Server database integration.

## Features

* Create, retrieve, update, and delete notes
* RESTful API architecture
* SQL Server database integration
* Backend application development using Spring Boot
* API testing and validation using Postman
* Structured project architecture for maintainability

## Technologies Used

* **Language:** Java
* **Framework:** Spring Boot
* **Database:** SQL Server
* **API:** REST APIs
* **Testing Tool:** Postman
* **Build Tool:** Maven

## API Operations

| Method | Operation               |
| ------ | ----------------------- |
| POST   | Create a new note       |
| GET    | Retrieve notes          |
| PUT    | Update an existing note |
| DELETE | Delete a note           |

## Project Structure

```text
notesmanagementapi/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/notesmanagementcrud/notesmanagementapi/
│   │   │       ├── Controller/
│   │   │       ├── model/
│   │   │       └── NotesmanagementapiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Getting Started

### Prerequisites

Make sure you have the following installed:

* Java JDK
* Maven
* SQL Server
* Postman

### Clone the Repository

```bash
git clone https://github.com/shanmukhi006/Notes-Management-System.git
cd Notes-Management-System
```

### Database Configuration

Configure your SQL Server database connection in:

```text
src/main/resources/application.properties
```

Use your own database credentials and avoid committing passwords or other sensitive information to GitHub.

### Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or on Windows:

```bash
.\mvnw.cmd spring-boot:run
```

The application will start on the configured Spring Boot server port.

## API Testing

The REST APIs can be tested using **Postman** by sending requests to the application's configured endpoints.

## Future Enhancements

* Add user authentication and authorization
* Implement input validation and global exception handling
* Add API documentation using Swagger/OpenAPI
* Add pagination and search functionality
* Deploy the application to a cloud platform

## Author

**Shanmukhi**
Computer Science Engineering
