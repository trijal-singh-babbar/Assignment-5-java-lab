// Pyramid.java

import java.lang.*;
class Pyramid extends Shape implements Volume
{
	public Pyramid(double side,double height)
	{
		super(side,height,0,0);	
	}
	
	public double calculateArea()
	{
		return dim_one * (dim_one + Math.sqrt(dim_one * dim_one + 4 * dim_two * dim_two));
	}
	
	public double calculatePerimeter()
	{ 
		return 4 * (dim_one);
	}
	
	public double calculateVolume()
	{
		return (1.0 / 3.0) * (dim_one * dim_one) * dim_two;
	}
}