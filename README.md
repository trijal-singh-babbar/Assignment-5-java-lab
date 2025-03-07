# Shape Calculator

## Overview
This project is a simple Java-based Shape Calculator that computes the area, perimeter, and volume (for 3D shapes) of various geometric shapes. The program is interactive and allows users to input dimensions to get corresponding results.

## Features
- Supports 2D and 3D shapes.
- Uses Object-Oriented Programming principles such as abstraction, inheritance, and interfaces.
- Includes an interactive console menu for user input.
- Implements an interface for volume calculations.

## Classes and Methods

### 1. `Shape.java` (Abstract Class)
Defines the base class for all shapes, containing dimensions and methods that child classes override.

#### Attributes:
- `dim_one`, `dim_two`, `dim_three`: Dimensions of the shape.
- `num_sides`: Number of sides of the shape.

#### Constructors:
- `Shape()`: Initializes dimensions to 0.
- `Shape(double dim_one, double dim_two, double dim_three, int num_sides)`: Initializes shape with given dimensions and number of sides.

#### Methods:
- `abstract double calculateArea()`: Abstract method to calculate area.
- `abstract double calculatePerimeter()`: Abstract method to calculate perimeter.
- `int getNumSides()`: Returns the number of sides.

### 2. `Triangle.java`
Represents a triangle with a base and height.

#### Constructor:
- `Triangle(double base, double height)`: Initializes a triangle with 3 sides.

#### Methods:
- `double calculateArea()`: Computes area using `0.5 * base * height`.
- `double calculatePerimeter()`: Computes perimeter assuming a right triangle.

### 3. `Rectangle.java`
Represents a rectangle with length and breadth.

#### Constructor:
- `Rectangle(double length, double breadth)`: Initializes a rectangle with 4 sides.

#### Methods:
- `double calculateArea()`: Computes area using `length * breadth`.
- `double calculatePerimeter()`: Computes perimeter using `2 * (length + breadth)`.

### 4. `Cube.java`
Represents a cube, implements `Volume` interface.

#### Constructor:
- `Cube(double side)`: Initializes a cube with 6 faces.

#### Methods:
- `double calculateArea()`: Computes total surface area using `6 * side²`.
- `double calculatePerimeter()`: Computes perimeter using `12 * side`.
- `double calculateVolume()`: Computes volume using `side³`.

### 5. `Pyramid.java`
Represents an equilateral pyramid, implements `Volume` interface.

#### Constructor:
- `Pyramid(double side, double height)`: Initializes an equilateral pyramid.

#### Methods:
- `double calculateArea()`: Computes total surface area.
- `double calculatePerimeter()`: Computes perimeter of the base.
- `double calculateVolume()`: Computes volume using `1/3 * base area * height`.

### 6. `Sphere.java`
Represents a sphere, implements `Volume` interface.

#### Constructor:
- `Sphere(double radius)`: Initializes a sphere.

#### Methods:
- `double calculateArea()`: Computes surface area using `4 * π * radius²`.
- `double calculatePerimeter()`: Computes circumference using `2 * π * radius`.
- `double calculateVolume()`: Computes volume using `(4/3) * π * radius³`.

### 7. `Cylinder.java`
Represents a cylinder, implements `Volume` interface.

#### Constructor:
- `Cylinder(double radius, double height)`: Initializes a cylinder.

#### Methods:
- `double calculateArea()`: Computes surface area using `2πr(h + r)`.
- `double calculatePerimeter()`: Computes perimeter.
- `double calculateVolume()`: Computes volume using `πr²h`.

### 8. `Volume.java` (Interface)
Defines the method for volume calculation.

#### Method:
- `double calculateVolume()`: Must be implemented by 3D shapes.

### 9. `Main.java`
Contains the main method and user interaction menu.

#### Features:
- Displays menu for shape selection.
- Takes user input for dimensions.
- Computes and displays area, perimeter, and volume where applicable.
- Allows repeated use until exit is chosen.

## How to Run
1. Compile all Java files:
   ```sh
   javac Main.java
   ```
2. Run the `Main` class:
   ```sh
   java Main
   ```

