//Name: Trijal Singh Babbar
//PRN: 23070126137
//AIML B3

// Main.java

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        while (true) { // Infinite loop to keep menu running
            System.out.println("===========================================");
            System.out.println("            SHAPE CALCULATOR");
            System.out.println("===========================================");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Cube");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.println("===========================================");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scan.nextLine());
            System.out.println("-------------------------------------------");

            switch (choice) {
                case 1: // Triangle
                    System.out.println("Enter base of Triangle: ");
                    double base = Double.parseDouble(scan.nextLine());

                    System.out.println("Enter height of Triangle: ");
                    double height = Double.parseDouble(scan.nextLine());

                    Triangle triangle = new Triangle(base, height);
                    System.out.println("Area of Triangle: " + triangle.calculateArea());
                    System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());
                    break;

                case 2: // Rectangle
                    System.out.println("Enter length of Rectangle: ");
                    double length = Double.parseDouble(scan.nextLine());

                    System.out.println("Enter breadth of Rectangle: ");
                    double breadth = Double.parseDouble(scan.nextLine());

                    Rectangle rectangle = new Rectangle(length, breadth);
                    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                    System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
                    break;

                case 3: // Cube
                    System.out.println("Enter side of Cube: ");
                    double side = Double.parseDouble(scan.nextLine());

                    Cube cube = new Cube(side);
                    System.out.println("Total Surface Area of Cube: " + cube.calculateArea());
                    System.out.println("Perimeter of Cube: " + cube.calculatePerimeter());
                    System.out.println("Volume of Cube: " + cube.calculateVolume());
                    break;

                
                case 4: // Sphere
                    System.out.println("Enter radius of Sphere: ");
                    double radius2 = Double.parseDouble(scan.nextLine());

                    Sphere sphere = new Sphere(radius2);
                    System.out.println("Total Surface Area of Sphere: " + sphere.calculateArea());
                    System.out.println("Perimeter of Sphere: " + sphere.calculatePerimeter());
                    System.out.println("Volume of Sphere: " + sphere.calculateVolume());
                    break;

                case 5: // Cylinder
                    System.out.println("Enter radius of Cylinder: ");
                    double radius3 = Double.parseDouble(scan.nextLine());

                    System.out.println("Enter height of Cylinder: ");
                    double height2 = Double.parseDouble(scan.nextLine());

                    Cylinder cylinder = new Cylinder(radius3, height2);
                    System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
                    System.out.println("Perimeter of Cylinder: " + cylinder.calculatePerimeter());
                    System.out.println("Volume of Cylinder: " + cylinder.calculateVolume());
                    break;

                case 6: // Equilateral Pyramid
                    System.out.println("Enter side of Equilateral Pyramid: ");
                    double side3 = Double.parseDouble(scan.nextLine());

                    System.out.println("Enter height of Equilateral Pyramid: ");
                    double height3 = Double.parseDouble(scan.nextLine());

                    Pyramid ep = new Pyramid(side3, height3);
                    System.out.println("Total Surface Area of Equilateral Pyramid: " + ep.calculateArea());
                    System.out.println("Perimeter of Base of Equilateral Pyramid: " + ep.calculatePerimeter());
                    System.out.println("Volume of Equilateral Pyramid: " + ep.calculateVolume());
                    break;

                case 7: // Exit program
                    System.out.println("\nExiting program... ");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }

            System.out.println("-------------------------------------------\n");
        }
    }
}