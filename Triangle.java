// Triangle.java

import java.lang.*;
class Triangle extends Shape
{
	public Triangle(double base,double height)
	{
		super(base, height,0,3);	
	}
	
	public double calculateArea()
	{
		return 0.5 * dim_one * dim_two;
	}
	
	public double calculatePerimeter()
	{
		return (dim_one + dim_two) + Math.sqrt((dim_one * dim_one) + (dim_two * dim_two));
	}

}