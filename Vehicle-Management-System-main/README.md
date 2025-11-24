# Vehicle-Management-System

Here is a **clean, polished, professional README.md** written *exactly* for **your Vehicle Management System program** based on the code and explanation you provided.
Simple, clear, and submission-ready.

---

# **🚗 Vehicle Management System (Java OOP Project)**

A Java program that demonstrates Object-Oriented Programming concepts using an inheritance hierarchy of vehicles.
The project models different types of vehicles (Car, Motorcycle, Truck) using abstraction, inheritance, method overriding, and polymorphism.

---

## **✨ Features**

* **Abstract Base Class (Vehicle):**
  Defines common properties (brand, model) and shared behavior.

* **Child Classes (Car, Motorcycle, Truck):**
  Each vehicle type extends the base class and provides its own behavior.

* **Method Overriding:**
  Child classes override methods like `startEngine()` and `displayInfo()`.

* **Polymorphism (Run-time):**
  A list of `Vehicle` objects can store different types of vehicles.
  The JVM automatically selects the correct method implementation at runtime.

* **Encapsulation & Constructor Chaining:**
  Uses `super()` to initialize parent class attributes.

---

## **📂 Project Structure**

```
VehicleManagementSystem/
│── Vehicle.java          # Abstract parent class
│── Car.java              # Child class extending Vehicle
│── Motorcycle.java       # (Optional) Child class extending Vehicle
│── Truck.java            # (Optional) Child class extending Vehicle
│── VehicleManager.java   # Main class demonstrating polymorphism
```

---

## **🧩 Code Summary**

### **1. Vehicle.java (Parent Abstract Class)**

* Contains common fields: `brand`, `model`
* Provides shared methods: `displayInfo()`, `stopEngine()`
* Declares abstract method: `startEngine()` (must be overridden)

---

### **2. Car.java (Child Class Example)**

* Extends `Vehicle`
* Adds unique field: `numberOfDoors`
* Implements `startEngine()` using its own behavior
* Overrides `displayInfo()` to show extra details
* Adds a child-specific method: `openTrunk()`

---

### **3. VehicleManager.java (Main Program)**

* Creates a list of type `Vehicle`
* Stores `Car` objects inside it (and can store Motorcycle, Truck, etc.)
* Demonstrates **dynamic method dispatch**
* Calls:

  * `displayInfo()` → overridden version
  * `startEngine()` → polymorphic version
  * `stopEngine()` → inherited version
* Shows how to call child-specific methods using casting

---

## **▶️ How to Run**

### **1. Compile all Java files**

```bash
javac *.java
```

### **2. Run the main program**

```bash
java VehicleManager
```

---

## **📝 Example Output**

```
--- 🌍 Vehicle Management System Demo ---
--- Vehicle Information ---
Brand: Toyota
Model: Camry
Doors: 4
**Car Engine Started:** The Toyota Camry key is turned.
Toyota Camry engine stopped.
---------------------------------
Toyota Camry trunk is open.
```

---

## **🎯 OOP Concepts Demonstrated**

| Concept               | Explanation                                          | Where Used                    |
| --------------------- | ---------------------------------------------------- | ----------------------------- |
| **Inheritance**       | Child classes reuse attributes & methods from parent | `class Car extends Vehicle`   |
| **Abstract Class**    | Base class with common code + abstract behavior      | `Vehicle`                     |
| **Method Overriding** | Child provides custom behavior                       | `Car.startEngine()`           |
| **Polymorphism**      | Parent reference → Child object                      | `List<Vehicle> vehicles`      |
| **Dynamic Dispatch**  | JVM selects method at runtime                        | `v.startEngine()` inside loop |
| **Encapsulation**     | Fields hidden, accessed through constructor          | `brand`, `model`              |

---

## **📌 Future Enhancements**

* Implement full versions of `Motorcycle` and `Truck`
* Add fuel type, engine CC, load capacity, etc.
* Add interactive menu for adding/removing vehicles
* Store vehicle data in a file or database

---

## **👤 Author**

**Name:** *N Raja Ravi Varma*

**Register Number:** *24MIM10027*

**Course:** *Programming in Java*

---
