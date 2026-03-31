# IT1214-Warehouse-Inventory-System
Java OPP 1st Viva Project

 Warehouse Inventory Management System

**Project Description**

This project is a **console-based Warehouse Inventory Management System** developed using **Java** and the **Java Collections Framework**.

It demonstrates how core **Object-Oriented Programming (OOP)** principles and collections like **HashMap** and **ArrayList** can be used to manage real-world inventory operations efficiently.

**Objectives**

* Apply Java OOP concepts (Encapsulation, Abstraction, Composition)
* Use Java Collections Framework in a practical scenario
* Build a modular and maintainable system

##  Features

The system supports the following operations:

*  Add new items to inventory
*  Remove existing items
*  Update item quantity
*  Search items (by ID or Name)
*  Display all inventory items
*  Handle invalid inputs gracefully

##  System Design

### 🔹 Class: `Item`

Represents a single inventory item.

**Attributes:**

* `itemId` (String)
* `itemName` (String)
* `quantity` (int)
* `price` (double)

**Methods:**

* Constructors
* Getters and Setters
* `toString()` method

---

### 🔹 Class: `Inventory`

Manages all inventory items using **HashMap**.

**Responsibilities:**

* Add items
* Remove items
* Update quantity
* Search by ID or name
* Display all items

---

### 🔹 Class: `Warehouse`

Main class with a **menu-driven console interface**.

**Responsibilities:**

* Interact with user
* Call Inventory methods
* Handle user inputs

---

## 🛠️ Technologies Used

* Java
* Java Collections Framework (HashMap, ArrayList)
* OOP Principles

---

##  How to Run the Program

### 1. Compile the Java files

```bash
javac *.java
```

### 2. Run the program

```bash
java Warehouse
```

---

## 💻 Sample Output

```
=== Warehouse Inventory System ===
1. Add Item
2. Remove Item
3. Update Quantity
4. Search Item
5. View All Items
0. Exit

Enter choice: 1
Enter Item ID: I001
Enter Item Name: Laptop
Enter Quantity: 10
Enter Price: 1200
Item added successfully.
```

---

##  Project Structure

```
IT1214-Warehouse-Inventory-System/
│
├── Item.java
├── Inventory.java
├── Warehouse.java
└── README.md
```

---

##  OOP Concepts Used

* **Encapsulation** → Private variables with getters/setters
* **Abstraction** → Inventory hides internal logic
* **Composition** → Warehouse contains Inventory
* **Modularity** → Separate classes for different responsibilities

---

##  Future Improvements

* Add file storage (save/load inventory)
* Implement GUI (Java Swing / JavaFX)
* Add item price update feature
* Add database integration (MySQL)

---

##  Author

* SMMIB Senavirathna


## 📎 Submission Notes

* Minimum 3 commits included ✔
* Code is well-structured and commented ✔
* Program compiles and runs successfully ✔

---
