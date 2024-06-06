# MyWebApp_java

## Description

MyWebApp is a simple Java web application using Servlets, JSP, and JDBC. It includes user registration and login functionality, with dynamic pages such as a home page and an about page.

## Features

- User registration and login
- Dynamic home page with user-specific content
- Header and footer included on each page

## Technologies Used

- Java EE (Servlets, JSP)
- JDBC
- MySQL
- Apache Tomcat

## Setup Instructions

### Prerequisites

- JDK 8 or higher
- Apache Tomcat 9 or higher
- MySQL Server
- Eclipse IDE
- MySQL Connector/J

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/MyWebApp.git
cd MyWebApp
```

### 2. Set Up the Database

```sql
CREATE DATABASE mywebappdb;
USE mywebappdb;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
```

### 3. Configure the Project in Eclipse

1. Import the project into Eclipse (`File -> Import -> Existing Projects into Workspace`).
2. Add MySQL Connector/J to the build path (place the JAR file in the `lib` folder and add it via `Build Path -> Add External Archives`).

### 4. Set Up Apache Tomcat

1. Add Tomcat to Eclipse (`Window -> Show View -> Servers -> New -> Server -> Apache -> Tomcat`).

### 5. Deploy and Run

1. Right-click the project -> `Run As -> Run on Server`.
2. Access the application at `http://localhost:8080/MyWebApp/index.html`.

## Usage

- **Register:** Go to the register page and create an account.
- **Login:** Use the registered email and password to log in.
- **Home Page:** Displays a welcome message.
- **About Us:** Accessible via the header links.
