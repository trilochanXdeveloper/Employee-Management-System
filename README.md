# Employee Management System (Core Java)

## 📌 Overview
Employee Management System is a console-based Java application developed using Core Java concepts.  
The application allows users to add, view, search, update, and delete employee records while demonstrating clean object-oriented design and proper exception handling.

This project is designed to strengthen understanding of backend logic and can be easily extended to use a database with JDBC.

---

## ⚙️ Features
- Add new employee details
- View all employees
- Search employee by ID
- Update employee information
- Delete employee records
- Custom exception handling for business errors
- Menu-driven console interaction

---

## 🧠 Concepts Used
- Core Java
- OOP Principles (Encapsulation, Data Hiding)
- Collections Framework (ArrayList)
- Exception Handling
- Custom Exceptions
- Scanner-based user input
- Clean separation of model, service, and application layers

---

## 🏗️ Project Structure
```
org.emptive
│
├── model
│ └── Employee.java
│
├── service
│ └── EmployeeService.java
│
├── exception
│ └── EmployeeNotFoundException.java
│
└── EmployeeApp.java
```

---

## ▶️ How the Application Works
1. User selects an option from the menu
2. Application reads input from console
3. Employee object is created or modified
4. Data is stored in an in-memory ArrayList
5. Required operation is performed
6. Exceptions are handled gracefully
7. Program runs until user chooses Exit

---

## 💡 Note on Data Storage
Currently, employee data is stored in memory using an ArrayList.  
Once the application exits, the data is cleared.  
This design can be extended to use JDBC and a database for permanent storage.

---

## 🚀 Future Enhancements
- JDBC integration for persistent storage
- DAO layer implementation
- Logging support
- Validation improvements

---

## 👨‍💻 Author
**Trilochan Pradhan**  
Java Backend / Core Java Developer  
