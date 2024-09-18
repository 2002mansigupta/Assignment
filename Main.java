package anudip;

// Base class Shape
abstract class Shape {
    // Abstract method area to be overridden by subclasses
    abstract double area();
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method to calculate the area of a circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override area method to calculate the area of a rectangle
    @Override
    double area() {
        return length * width;
    }
}

// Subclass Square (inherited from Rectangle)
class Square extends rectangle {
    // Constructor to initialize side (length and width are equal)
    public Square(double side) {
        super(side, side);
    }
}

// Main class to test the area calculations
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new rectangle(4, 6); // Rectangle with length 4 and width 6
        Shape square = new Square(4); // Square with side 4

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}

