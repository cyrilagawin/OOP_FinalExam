# [Project Title: e.g., Repair Ticket and Technician Assignment System]

## 📖 Project Overview
This project is a multi-table, database-driven desktop application developed in Java Swing. It serves as the Final Project for Object-Oriented Programming (OOP) and solves a practical real-world information management problem through structured data modeling, GUI development, and relational database implementation. 

**Problem Statement:** [Write a short 1-2 sentence description of the specific problem your system solves. Example: "Managing local repair shop workflows is often disorganized. This system tracks customers, technicians, services, and repair orders to ensure efficient operational management."]

## ✨ Features
* **Complete CRUD Operations:** Create, Read, Update, and Delete records safely across multiple modules.
* **Advanced Search Functionality:** Filter and find records dynamically based on ID, name, category, or status.
* **Relational Database Integrity:** Prevents invalid relationship operations (like orphan records) using a normalized 5+ table MySQL schema.
* **Interactive GUI:** Event-driven Java Swing interface with multi-window navigation (Dashboards, Management Frames, Transaction Frames).
* **Data Validation:** Comprehensive error handling and user input validation before executing database commits.

## 🛠️ Technologies Used
* **Language:** Java (Object-Oriented Programming)
* **GUI Framework:** Java Swing (JFrames, JTables, etc.)
* **Database:** MySQL
* **Database Connection:** JDBC
* **Design Tools:** [Mention tool used for ERD/UML, e.g., Draw.io, Lucidchart]

## 🗄️ Database Structure
The database is strictly normalized and contains [Number, e.g., 5] interconnected tables demonstrating one-to-many and transaction-oriented relationships.

1.  `users` / `accounts`
2.  `[Primary Master Table, e.g., customers]`
3.  `[Secondary Master Table, e.g., technicians]`
4.  `[Transaction Header Table, e.g., repair_orders]`
5.  `[Transaction Detail Table, e.g., repair_order_items]`

*(The complete SQL script to generate this database is included in the `/database` folder, and the Entity Relationship Diagram (ERD) can be found in the `/docs` folder).*

## 🚀 Installation and Setup

### Prerequisites
* Java Development Kit (JDK) 8 or higher
* MySQL Server and MySQL Workbench (or XAMPP/WAMP)
* MySQL JDBC Connector (`mysql-connector-java.jar`)

### Steps to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/](https://github.com/)[your-username]/[your-repo-name].git
    ```
2.  **Set up the Database:**
    * Open MySQL.
    * Run the provided `[your_database_name].sql` script located in the repository to create the schema and tables.
    * Insert the default sample records provided in the script.
3.  **Configure the Connection:**
    * Locate the Database Connection module in the source code (e.g., `DBConnection.java`).
    * Update the `DB_URL`, `USER`, and `PASSWORD` strings to match your local MySQL credentials.
4.  **Compile and Run:**
    * Add the JDBC driver to your project's build path/libraries.
    * Run the Main Application Launcher (`Main.java` or `LoginFrame.java`).



| Dashboard | Record Management |
| :---: | :---: |
| ![Dashboard](link-to-dashboard-image.png) | ![Management](link-to-management-image.png) |
| **Transaction Frame** | **Search & View** |
| ![Transaction](link-to-transaction-image.png) | ![Search](link-to-search-image.png) |





