# ShapeMetricCalculator

**Build shapes and calculate their area with classes, objects, and methods.**

## Introduction

This project focuses on:
- Creating classes in Java.
- Working with objects.
- Using methods to build shapes and calculate their areas.
- Passing shape objects as arguments to utility class methods.

## Features

- Rectangle and Circle classes with member variables and constructors.
- A utility class `ShapeMetricCalculator` for area calculations using static methods.
- Implementation of object-oriented programming concepts such as constructors and method overloading.

## Getting Started

Follow the steps below to get the project running on your local machine:

### Prerequisites
- IntelliJ IDEA or any preferred Java IDE
- Java JDK 8 or above

### Setup

1. **Create a new project:**
   - Open IntelliJ and create a new Java project named `classy-shapes-project`.
   - Ensure the language is set to Java and the build system to IntelliJ.

2. **Define shape classes:**
   - Create the `Rectangle` class with `length` and `width` properties, and both a no-argument and parameterized constructor.
   - Create the `Circle` class with a `radius` property and similar constructors.

3. **Create the utility class:**
   - Add a `ShapeMetricCalculator` class containing static methods for area calculations:
     - `calculateRectangleArea(Rectangle rectangle)`
     - `calculateCircleArea(Circle circle)`

4. **Write the main program:**
   - Create a `Main` class and instantiate `Rectangle` and `Circle` objects with parameterized constructors.
   - Use the utility methods to calculate and display their areas.

## Example Code

### Rectangle Classes
  ```java
      public class Rectangle {
          double length;
          double width;
      
          public Rectangle() {
              this.length = 1.0;
              this.width = 1.0;
          }
      
          public Rectangle(double length, double width) {
              this.length = length;
              this.width = width;
          }
      }
```

### Circle Classes
  ```java
    public class Circle {
        double radius;
    
        public Circle() {
            this.radius = 1.0;
        }
    
        public Circle(double radius) {
            this.radius = radius;
        }
    }
```

### ShapeMetricCalculator Utility Class
  ```java
    public class ShapeMetricCalculator {
        public static double calculateRectangleArea(Rectangle rectangle) {
            return rectangle.length * rectangle.width;
        }
  
        public static double calculateCircleArea(Circle circle) {
            return Math.PI * Math.pow(circle.radius, 2);
        }
    }
```

### Main Program
  ```java
    public class Main {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5.0, 3.0);
            Circle circle = new Circle(4.0);
    
            double rectangleArea = ShapeMetricCalculator.calculateRectangleArea(rectangle);
            double circleArea = ShapeMetricCalculator.calculateCircleArea(circle);
    
            System.out.println("Area of Rectangle: " + rectangleArea);
            System.out.println("Area of Circle: " + circleArea);
        }
    }
```
### Learnings and Extensions
- Explore creating additional shapes like ```Triangle``` and add corresponding methods in ```ShapeMetricCalculator```.
- Practice writing reusable, modular code with object-oriented principles.

### Conclusion
This project demonstrates how to use classes, objects, and utility methods to perform calculations in Java. It’s an excellent way to practice core concepts and build a reusable codebase.
