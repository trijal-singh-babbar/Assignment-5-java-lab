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
		return 12 * side;
	}
	
	public double calculateSurfaceArea();
	{
		return 6 * dim_one * dim_one;
	}
	
	public double calculateVolume();
	{
		return side*side*side;
	}
}