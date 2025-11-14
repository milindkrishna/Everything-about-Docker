import java.util.Scanner;

// Abstract class for geometric shapes
abstract class Shape {
    abstract double calculateArea();
    abstract double calculateVolume();
}

// Class for Square
class Square extends Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    double calculateArea() {
        return side * side;
    }
    
    @Override
    double calculateVolume() {
        return 0; // 2D shape has no volume
    }
    
    public double calculateCube() {
        return side * side * side;
    }
}

// Class for Circle
class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double calculateVolume() {
        return 0; // 2D shape has no volume
    }
}

// Class for Cube
class Cube extends Shape {
    private double side;
    
    public Cube(double side) {
        this.side = side;
    }
    
    @Override
    double calculateArea() {
        return 6 * side * side; // Surface area
    }
    
    @Override
    double calculateVolume() {
        return side * side * side;
    }
}

// Class for Sphere
class Sphere extends Shape {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius; // Surface area
    }
    
    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

// Class for Cylinder
class Cylinder extends Shape {
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height); // Surface area
    }
    
    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

// Main class
public class GeometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Geometric Calculator ===");
        System.out.println("Choose a shape:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Cube");
        System.out.println("4. Sphere");
        System.out.println("5. Cylinder");
        System.out.print("Enter your choice (1-5): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                System.out.println("\nResults for Square:");
                System.out.println("Area: " + square.calculateArea());
                System.out.println("Cube of side: " + square.calculateCube());
                break;
                
            case 2:
                System.out.print("Enter the radius of the circle: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                System.out.println("\nResults for Circle:");
                System.out.println("Area: " + circle.calculateArea());
                break;
                
            case 3:
                System.out.print("Enter the side length of the cube: ");
                double cubeSide = scanner.nextDouble();
                Cube cube = new Cube(cubeSide);
                System.out.println("\nResults for Cube:");
                System.out.println("Surface Area: " + cube.calculateArea());
                System.out.println("Volume: " + cube.calculateVolume());
                break;
                
            case 4:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = scanner.nextDouble();
                Sphere sphere = new Sphere(sphereRadius);
                System.out.println("\nResults for Sphere:");
                System.out.println("Surface Area: " + sphere.calculateArea());
                System.out.println("Volume: " + sphere.calculateVolume());
                break;
                
            case 5:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                System.out.println("\nResults for Cylinder:");
                System.out.println("Surface Area: " + cylinder.calculateArea());
                System.out.println("Volume: " + cylinder.calculateVolume());
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}