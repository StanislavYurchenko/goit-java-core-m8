# Graphic Editor — Shape Hierarchy (GoIT Java Core — Module 8)

This project is a Java-based implementation of a class hierarchy for a graphic editor, demonstrating core Object-Oriented Programming (OOP) principles such as abstraction, inheritance, encapsulation, and polymorphism.

---

## 📋 Task Requirements

You are creating a graphic editor. Design a flexible class hierarchy that meets the following criteria:

1. **Base Shape Class:** Create a base `Shape` class containing a method to return the shape's name.
2. **Shape Subclasses:** Implement at least 5 concrete classes that inherit from `Shape` (e.g., `Circle`, `Quad`, `Triangle`, `Rectangle`, `Oval`).
3. **Printer Class:** Implement a printer class (`ShapePrinter`) that accepts a `Shape` instance and prints its details. The printer must interact directly with the base `Shape` type rather than concrete sub-types.
4. **OOP Best Practices:** Leverage key OOP tools including abstract classes, method overriding, access modifiers, and encapsulation.

---

## 🏗️ Architecture & Design Principles

* **Abstraction:** `Shape` is defined as an `abstract class` with contract methods: `getName()`, `getArea()`, and `getPerimeter()`.
* **Inheritance:** Concrete shapes (`Circle`, `Quad`, `Triangle`, `Rectangle`, `Oval`) extend `Shape` and provide specific implementations for calculations and names.
* **Encapsulation:** Shape dimensions are stored in `private final` fields, making objects immutable and protecting their state.
* **Polymorphism:** `ShapePrinter` accepts references of type `Shape`, allowing it to process any current or future shape subclass without modifying its code.

---

## 📁 Project Structure

```text
goit-java-core-m8/
└── shape/
    ├── Shape.java          # Base abstract class
    ├── Circle.java         # Circle implementation
    ├── Quad.java           # Square/Quad implementation
    ├── Triangle.java       # Triangle implementation (Heron's formula)
    ├── Rectangle.java      # Rectangle implementation
    ├── Oval.java           # Oval implementation
    ├── ShapePrinter.java  # Utility printer class (Polymorphic processor)
    └── Main.java           # Application entry point & demo
