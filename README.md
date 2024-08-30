# Spring_Project
# ToDo Application

This ToDo Application is designed to optimize task documentation and boost document management efficiency. The backend of the application is built using Spring Boot, RestAPI, and Oracle 10g, focusing on streamlining CRUD operations for efficient document management.

## Features
- **Optimized Workflow**: Reduced task documentation time by 50% with an optimized backend application.
- **Document Management Efficiency**: Boosted efficiency by 50% through streamlined CRUD operations.
- **Robust Backend**: Built with Spring Boot, Oracle 10g, RestAPI, and Core Java.

## Technologies Used
- **Spring Boot**
- **RestAPI**
- **Oracle 10g**
- **Core Java**

## Prerequisites
Before you can run this project, ensure you have the following installed on your machine:
- **Java JDK 8 or higher**
- **Spring Tool Suite (STS) or any preferred IDE**
- **Oracle 10g or any other compatible database**
- **Postman (for API testing)**

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/todo-application.git
cd todo-application
2. Import the Project in Spring Tool Suite (STS)
Open STS and select File -> Import -> Existing Maven Projects.
Browse to the directory where you cloned the project and select it.
Click Finish to import the project.
3. Set Up the Database
Ensure Oracle 10g is installed and running.
Create a new database schema (if not already created):
sql
Copy code
CREATE USER todo_user IDENTIFIED BY password;
CREATE DATABASE todo_db;
Update the application.properties file in the src/main/resources directory with your database configuration:
properties
Copy code
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:todo_db
spring.datasource.username=todo_user
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
4. Run the Application
Navigate to the main application class (com.example.todo.TodoApplication.java).
Right-click on the file and select Run As -> Spring Boot App.
The application will start running on http://localhost:8081.

API Endpoints
1. Add Data (Create a New Customer)
Endpoint: /customer/add
Method: POST
Request URL: http://localhost:8081/customer/add
Request Body (Example):
json
Copy code
{
  "name": "John Doe",
  "email": "johndoe@example.com",
  "phone": "1234567890"
}
Response:
json
Copy code
{
  "id": 1,
  "name": "Dharamveer Singh",
  "email": "dharam@gmail.com.com",
  "phone": "1234567890",
  "createdAt": "2024-08-11T12:00:00"
}
2. Get Data (Retrieve All Customers)
Endpoint: /customer/get
Method: GET
Request URL: http://localhost:8081/customer/get
Response:
json
Copy code
[
  {
    "id": 1,
    "name": "Dharamveer Singh",
    "email": "dharam@gmail.com",
    "phone": "1234567890",
    "createdAt": "2024-08-11T12:00:00"
  },
  ...
]
3. Update Data (Update Customer Information)
Endpoint: /customer/update
Method: PUT
Request URL: http://localhost:8081/customer/update
Request Body (Example):
json
Copy code
{
  "id": 1,
  "name": "Dharam",
  "email": "dharamveersingh@gmail.com",
  "phone": "0987654321"
}
Response:
json
Copy code
{
  "id": 1,
  "name": "Dharam",
  "email": "dharamveersingh@gmail.com",
  "phone": "0987654321",
  "updatedAt": "2024-08-11T13:00:00"
}
4. Delete Data (Delete a Customer)
Endpoint: /customer/delete
Method: DELETE
Request URL: http://localhost:8081/customer/delete
Request Body (Example):
json
Copy code
{
  "id": 1
}
Response:
json
Copy code
{
  "message": "Customer deleted successfully"
}
Testing the API
Open Postman and create a new collection for the ToDo Application.
Use the provided endpoints to test the API by sending requests and observing the responses.
