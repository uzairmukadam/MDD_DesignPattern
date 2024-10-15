# Store Product Management System

## Overview

This program demonstrates the Factory Method Design Pattern by simulating a store that sells different types of products (Pens and Pencils). The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

## Features

- **Factory Method Design Pattern**: Utilizes the Factory Method Design Pattern to create and sell products.
- **Concrete Products**: Implements Pen and Pencil as concrete products.
- **Product Creators**: Implements PenCreator and PencilCreator to create instances of Pen and Pencil respectively.
- **Main Class**: Demonstrates the creation and selling of products.

## Classes and Interfaces

- **Product**: An interface that defines the method `sell()`.
- **Pen**: A class that implements the `Product` interface and represents a pen.
- **Pencil**: A class that implements the `Product` interface and represents a pencil.
- **ProductCreator**: An abstract class that declares the factory method `createProduct()`.
- **PenCreator**: A class that extends `ProductCreator` and creates an instance of `Pen`.
- **PencilCreator**: A class that extends `ProductCreator` and creates an instance of `Pencil`.
- **Store**: The main class that demonstrates the usage of the Factory Method Design Pattern by creating and selling products.

## How to Run

1. **Compile the Java files**:
    ```bash
    javac Product.java Pen.java Pencil.java ProductCreator.java PenCreator.java PencilCreator.java Store.java
    ```

2. **Run the main class**:
    ```bash
    java Store
    ```

3. **Expected Output**:
    ```plaintext
    Selling a pen...
    Selling a pencil...
    ```
