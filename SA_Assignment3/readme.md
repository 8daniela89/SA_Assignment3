## PROJECT DOCUMENTATION

This project is an exercise for structural design patterns in Java. It combines a small Spring Boot "Book Management System" with standalone pattern demos. The goal is to see how structural patterns (Adapter, Composite, Decorator, Facade, Proxy) organize classes and objects so changes stay localized.

## How to run

First, I made sure the structure of my project matches the one from the Git repository, meaning:

- Project SDK - 17
- Project language level 17
- update Lombok
  Then, I ran BookManagementApplication.java => Spring Boot

I opened Swagger UI to test CRUD -> http://localhost:8080/swagger

I added a book using POST /api/books with this JSON:
- {"title":"Clean Code","author":"Robert C. Martin","price":30.5}
then, I called GET /api/books and verified the book is returned.

I also opened the H2 console to see the data (http://localhost:8080/h2-console)
- JDBC URL: jdbc:h2:mem:librarydb
- User: sa
- Password: password