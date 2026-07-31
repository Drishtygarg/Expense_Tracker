<div align="center">

# 💰 Expense Tracker System

### A Console-Based Expense Management Application using Java, JDBC & MySQL

![Java](https://img.shields.io/badge/Java-23-orange?style=for-the-badge&logo=openjdk)
![MySQL](https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql)
![JDBC](https://img.shields.io/badge/JDBC-Database-green?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![Git](https://img.shields.io/badge/Git-Version%20Control-black?style=for-the-badge&logo=git)

</div>

---

# 📖 About the Project

Expense Tracker System is a console-based Java application that helps users record, organize, and manage their daily expenses. The project follows a modular architecture using the DAO (Data Access Object) design pattern and stores data securely in a MySQL database using JDBC.

This project was developed to strengthen practical knowledge of Core Java, Object-Oriented Programming, JDBC, Maven, and MySQL by building a real-world application.

---

# ✨ Features

- ➕ Add new expenses
- 📂 Expense categorization
- 💳 Payment method selection
- 📅 Automatic transaction date
- 📋 View all recorded expenses
- 🗄️ MySQL database integration
- 🏗️ DAO-based architecture
- ⚡ Maven dependency management
- 🔄 Modular project structure

---

# 🛠️ Tech Stack

| Technology | Purpose |
|------------|----------|
| Core Java | Application Logic |
| JDBC | Database Connectivity |
| MySQL | Database |
| Maven | Dependency Management |
| OOP | Code Organization |
| Git & GitHub | Version Control |

---

# 📁 Project Structure

```text
Expense_Tracker
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   ├── DAO
│   │   ├── models
│   │   ├── services
│   │   ├── utils
│   │   └── Main.java
│   │
│   └── resources
│
├── pom.xml
├── README.md
└── Project Documents
```

---

# ⚙️ System Architecture

```text
          User
            │
            ▼
        Main.java
            │
            ▼
     Expense Service
            │
            ▼
       Expense DAO
            │
            ▼
           JDBC
            │
            ▼
      MySQL Database
```

---

# 🗃️ Database

The application stores data in MySQL.

Main tables include:

- Users
- Expenses
- Categories
- Payment Methods

---

# 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/Drishtygarg/Expense_Tracker.git
```

### Open Project

Open the project in:

- VS Code
- IntelliJ IDEA

---

### Configure Database

Update your MySQL credentials inside

```text
DBConnection.java
```

---

### Build Project

```bash
mvn clean install
```

---

### Run Project

```bash
mvn exec:java "-Dexec.mainClass=com.expense.Expense_Tracker.Main"
```

---

# 📽️ Project Demonstration

A complete execution video has been included in this repository.

---

# 📚 Concepts Used

- Core Java
- Object-Oriented Programming
- JDBC
- MySQL
- DAO Design Pattern
- Maven
- Git
- GitHub

---

# 🎯 Future Enhancements

- 🔐 User Login & Registration
- 📊 Monthly Expense Analytics
- 📈 Charts & Graphs
- 📄 PDF Report Generation
- 📥 CSV Export
- 🔍 Search & Filter Expenses
- 💰 Budget Tracking
- 🌐 JavaFX/Web Version

---

# 👩‍💻 Author

## Drishty Garg

**B.Tech Information Technology**

🔗 LinkedIn

https://www.linkedin.com/in/drishty-garg-25637031d

🔗 GitHub

https://github.com/Drishtygarg

---

⭐ If you found this project helpful, consider giving it a star!
