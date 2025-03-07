// Cube.java

class Cube extends Shape
{
	public Cube(double side)
	{
		super(side, side, side, 6);
	}
	public double calculateArea()
	{
		return dim_one * dim_one * dim_one;
	}
	
	public double calculatePerimeter()
	{
		return 12 * a;
	}
	
	public double calculateSurfaceArea();
	{
		return 6 * dim_one * dim_one;
	}
	
	public double calculateVolume();
	{
		return a*a*a;
	}
}