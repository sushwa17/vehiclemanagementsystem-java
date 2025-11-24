# Vehicle Management System
**Student:** Mohammed Rabbani  
**Roll Number:** 24MIM10023  
**Course:** Programming in Java  
**Guide:** Pricilla Dinkar Moyya  
**Institution:** VIT Bhopal University  
**Date:** 24/11/25  

---

## 1. Abstract

The Vehicle Management System is a Java-based Object-Oriented Programming project designed to demonstrate the core principles of abstraction, inheritance, method overriding, and polymorphism. The system models different types of vehicles using an abstract parent class, Vehicle, which defines common attributes and behaviours shared by all vehicles. 

Child classes such as Car, Motorcycle, and Truck extend this base class and provide their own specific implementations of engine functionality and additional features. The main program uses polymorphism to manage multiple vehicle types through a single parent reference, showcasing dynamic method dispatch at runtime. This project highlights how OOP concepts enable cleaner code organization, reuse, and extensibility, forming the foundation for scalable software design.

---

## 2. Introduction

Vehicle modelling is a basic concept of Object-Oriented Programming in real-world software systems, such as transport management, fleet monitoring, automotive simulation, and smart mobility platforms.  
The goal of a vehicle management system is to represent different categories of vehicles in such a structured and reusable way, while each one of them can define its own unique behavior.

It was meant to be only a simple conceptual demonstration, but due to some academic project requirements, it has been fully implemented in Java.

The Java version provides:
- A clean, modular OOP architecture  
- An abstract base class with several specialized child classes  
- Overriding methods to demonstrate polymorphic behavior  
- Runtime dynamic dispatch through a unified Vehicle manager  
- Extensible design for adding future vehicle types or features  

---

## 3. Objectives

The primary objectives of this project are as follows:

### Implement a grid-based navigation system in Java
Develop a grid-based environment to simulate pathfinding and movement operations, forming the foundation of the navigation system.

### Support multiple search algorithms (BFS, UCS, A*)
Integrate classical search algorithms—Breadth-First Search, Uniform Cost Search, and A-Star—to explore and compare their efficiency and performance in finding optimal paths.

### Integrate admissible heuristics such as Manhattan and Euclidean distance
Incorporate heuristic functions to guide informed search algorithms like A*, enabling faster and more efficient path computation.

### Load maps from text files and update obstacles dynamically
Implement file-handling mechanisms that allow grid maps to be loaded from external text files, with the ability to modify obstacles or map configurations at runtime.

### Provide a command-line interface with user-configurable parameters
Design an interactive CLI that enables users to customize parameters such as map files, start and goal positions, and the choice of search algorithm.

### Log experiment results (path, statistics, time, nodes expanded)
Record detailed experimental data including discovered paths, execution time, number of expanded nodes, and other performance metrics for analysis.

### Generate 2D visualizations of grid maps with highlighted paths
Create a simple 2D visual representation of the grid environment to illustrate search progress, obstacles, and the final computed path.

---

## 4. System Overview

### 4.1 Project Structure (Standard Java Project)
```
VehicleManagementSystem/
├─ src/
│ ├─ main/
│ │ ├─ Vehicle.java
│ │ ├─ Car.java
│ │ ├─ Truck.java
│ │ ├─ Motorcycle.java
│ │ ├─ Main.java
│ ├─ resources/
│ └─ test/
```

This Maven-based structure ensures modularity, scalability, and ease of dependency management. Each package encapsulates a specific functionality of the system, allowing for better organization and future extensibility.

---

### 4.2 Core Modules

| **Module** | **Description** |
|-------------|----------------|
| Grid | Handles map loading, cell cost assignment, and neighbor generation. |
| Search | Implements search algorithms including BFS, UCS, and A*. |
| Heuristics | Provides admissible heuristics such as Manhattan and Euclidean distance. |
| Obstacles | Manages dynamic obstacle movement and updates using JSON input. |
| Utils | Includes helper classes for logging, timing, and result reporting. |
| Visualizer | Generates 2D grid visualizations with paths and obstacles. |
| Main | Serves as the command-line interface entry point. |

---

## 5. Algorithms Implemented 

### 5.1 Breadth-First Search (BFS)
- Explores the grid level by level.  
- Ideal for unweighted grids.  
- Guarantees the shortest path by the number of steps.  
- Utilizes a FIFO queue structure for node expansion.  

### 5.2 Uniform Cost Search (UCS)
- Expands the node with the lowest cumulative path cost.  
- Uses a priority queue for optimal selection.  
- Suitable for weighted grids and varying terrain costs.  
- Always finds the optimal path.  

### 5.3 A Search Algorithm*
A* integrates UCS with heuristic guidance to speed up pathfinding.

Where:  
- g(n) = Actual cost from the start node to n.  
- h(n) = Estimated cost from n to the goal (heuristic).  

**Heuristics Used:**
- Manhattan Distance – admissible in 4-directional grids.  
- Euclidean Distance – used when diagonal movement is allowed.  

A* is both complete and optimal when using admissible heuristics.

---

## 6. Dynamic Obstacles

Dynamic obstacle positions are defined in a JSON file (`dynamic.json`), for example:
```json
{
  "obstacles": [
    { "id": "o1", "positions": [[1,1],[1,2],[1,3]] }
  ]
}
```
At each time or expansion step, obstacles shift positions along predefined paths.
Invalid moves caused by collisions with dynamic obstacles are automatically pruned, ensuring safe and adaptive pathfinding.

## 7. Grid Representation

Grid maps are stored as .txt files.
Example (small.txt):
```
5 5
1 1 1 1 1
1 -1 1 -1 1
1 1 1 1 1
1 -1 1 -1 1
1 1 1 1 1
```
Legend:

1 → free cell

-1 → blocked

This representation is simple, human-readable, and easy to modify for experiments.

## 8. Visualization

The Visualizer module generates a 2D PNG output (e.g., visualization.png) representing the map and computed path.

Color Legend:

Light Gray → Free cells

Dark Gray → Obstacles

Green Circle → Start position

Blue Circle → Goal position

Red Line → Final computed path

This graphical representation helps in visually analyzing and comparing algorithm behaviors.

## 9. Implementation Details
### 9.1 Technologies Used

Java 17 – Core implementation language.

Apache Maven – Build automation and dependency management.

Jackson Databind – For parsing and handling JSON data.

JUnit 5 – For unit testing and validation.

Java2D – For rendering 2D visualizations.

### 9.2 Key Features

Clean, modular OOP architecture.

Optimized implementations of BFS, UCS, and A*.

Extendable heuristic and algorithm structure.

Dynamic obstacle updates and real-time adaptability.

Automated JSON-based result logging for experiments.

## 10. Testing

Unit testing using JUnit 5 validates all core functionalities, including:

Map loading and parsing accuracy.

Grid boundary and obstacle checks.

BFS path correctness in unweighted grids.

A* heuristic admissibility and path optimality.

## 11. Experimental Results

Sample Output (A Run):*
```
Path: [(0,0), (1,0), (2,0), (2,1), (2,2), (3,2), (4,2), (4,3), (4,4)]
Stats: {nodes_expanded=13, path_cost=8, time_ms=4}
Saved: visualization.png
Saved: runlog.json
```
### Observations:

BFS explores more nodes → slower in dense obstacle environments.

UCS performs best in cost-sensitive terrains.

A* delivers the fastest results due to heuristic-driven exploration.

Dynamic obstacles increase both path cost and search depth.

## 12. Conclusion

This Java-based pathfinding system successfully implements multiple classical search algorithms—BFS, UCS, and A*—within a structured, extensible, and visually demonstrable framework.
The project achieves real-time adaptability through dynamic obstacle handling, detailed logging, and visual analytics.

It serves as both an educational tool and a prototype for practical applications such as robotics navigation, autonomous systems, and game AI.

## 13. Future Enhancements

Potential future developments include:

Incorporating D Lite* for real-time replanning.

Developing a graphical user interface (GUI) for interactive simulation.

Extending to multi-agent pathfinding scenarios.

Introducing variable terrain costs and terrain types.

Implementing randomized or probabilistic obstacle movements.

## 14. References

Stuart Russell & Peter Norvig – Artificial Intelligence: A Modern Approach

Wikipedia – BFS, UCS, and A Search Algorithms

Oracle Java Documentation – Core Java 17 Features
