// Cube.java

import java.lang.*;
class Cube extends Shape implements Volume
{
	public Cube(double side)
	{
		super(side,0,0,6);	
	}
	
	public double calculateArea()
	{
		return 6 * dim_one * dim_one;
	}
	
	public double calculatePerimeter()
	{
		return 12 * dim_one;
	}
	
	public double calculateVolume()
	{
		return dim_one * dim_one * dim_one;
	}
}