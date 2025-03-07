// Main.java

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base of triangle: ");
		double base = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter height of triangle: ");
		double height = Double.parseDouble(sc.nextLine());
		
		Shape triangle = new Triangle(base, height);
		
		System.out.println("Area of triangle is : "+triangle.calculateArea());
		System.out.println("Perimeter of triangle is : "+triangle.calculatePerimeter());
		
		
		System.out.println("Enter length of rectangle: ");
		double len = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter breadth of rectangle: ");
		double b = Double.parseDouble(sc.nextLine());
		
		Shape rectangle = new Rectangle(len, b);
		System.out.println("Area of rectangle is : "+rectangle.calculateArea());
		System.out.println("Perimeter of rectangle is : "+rectangle.calculatePerimeter());
		
	}
}