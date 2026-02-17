# 🚀 User CRUD API – Spring Boot

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Status](https://img.shields.io/badge/Status-Active-success)

A production-ready RESTful API for user management built with Java and Spring Boot.  
This project demonstrates backend development fundamentals, clean layered architecture, and best practices for building scalable web applications.

It provides full CRUD operations (Create, Read, Update, Delete) and follows industry-standard design principles.

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate (ORM)
- Maven
- H2 / MySQL (configurable database)

---

## 🏗️ Architecture & Design

The application follows a layered architecture pattern to ensure separation of concerns and maintainability:

Controller → Service → Repository → Database

### 🔹 Controller Layer
Handles HTTP requests and responses using RESTful conventions.

### 🔹 Service Layer
Contains business logic and application rules.

### 🔹 Repository Layer
Manages data persistence using Spring Data JPA.

### 🔹 Database Layer
Stores and manages application data.

This structure improves testability, readability, and scalability.

---

## 👤 Domain Model – User Entity

The `User` entity includes:

| Field  | Type       | Description            |
|--------|------------|------------------------|
| id     | Long       | Unique identifier      |
| name   | String     | User's name            |
| age    | int        | User's age             |
| birth  | LocalDate  | Birth date             |

---

## 🔗 REST API Endpoints

| Method | Endpoint        | Description              |
|--------|-----------------|--------------------------|
| POST   | /users          | Create a new user        |
| GET    | /users          | Retrieve all users       |
| GET    | /users/{id}     | Retrieve user by ID      |
| PUT    | /users/{id}     | Update an existing user  |
| DELETE | /users/{id}     | Delete a user            |

---

## ▶️ Running the Application

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/your-repository.git
```

### 2️⃣ Navigate to the project folder

```bash
cd user-crud-api
```

### 3️⃣ Run the application

```bash
mvn spring-boot:run
```

The API will start at:

```
http://localhost:8080
```

---

## 🎯 Key Learning Outcomes

- RESTful API development with Spring Boot  
- Layered architecture implementation  
- ORM integration using Hibernate  
- Data persistence with Spring Data JPA  
- Clean code organization and separation of responsibilities  

---

## 🚀 Future Improvements

- DTO pattern implementation  
- Global exception handling  
- Input validation  
- Unit and integration tests  
- Swagger/OpenAPI documentation  
- Docker containerization  

---

## 👨‍💻 Author

**Djalma Ponciano Rodrigues**

Backend Developer | Java & Spring Boot Enthusiast  

This project was developed for educational purposes and portfolio demonstration.
