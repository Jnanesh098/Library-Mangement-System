
## Title : Library Management System
-------

## Project Description :
1. The Library Management System is a REST API based application developed using Spring Boot and MySQL.
2. It helps to manage library operations such as adding books, registering members, and issuing books to members.
3. This project demonstrates the use of Spring Boot, Spring Data JPA, REST APIs, and MySQL database integration.

--------

## Technologies Used :

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (for API testing)
- Spring Tool Suite (STS)

--------

## Features :

- Add new books to the library
- Register new members
- View all available books
- View registered members
- Issue books to members
- Automatically reduce available book copies when issued

--------

## Project Structure :

com.example.library
│
├── controller
│   ├── BookController
│   ├── MemberController
│   └── IssueController
│
├── entity
│   ├── Book
│   ├── Member
│   └── IssueRecord
│
├── repository
│   ├── BookRepository
│   ├── MemberRepository
│   └── IssueRepository
│
├── service
│   └── IssueService
│
└── LibraryManagementApplication

-----------

## API Endpoints :

   Add Book
   POST /books

Example JSON:
    ```json
{
  "title": "Java Programming",
  "author": "James Gosling",
  "availableCopies": 5
}
```

Get All Books
GET /books

---------

   Add Member
   POST /members

Example JSON:
  ```json
{
  "name": "Rahul",
  "email": "rahul@gmail.com",
  "phone": "9876543210"
}
```

Get All Members
GET /members

---------

    Issue Book
    POST /issue/{memberId}/{bookId}

Example:
    POST /issue/1/1

-------

## Database Configuration :

### Update the application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
| spring.datasource.username=root
| spring.datasource.password=your_password

| spring.jpa.hibernate.ddl-auto=update
| spring.jpa.show-sql=true

---------

## How to Run the Project :

1. Clone the repository
2. Open the project in Spring Tool Suite (STS)
3. Configure MySQL database
4. Run the main class
5. Test APIs using Postman
