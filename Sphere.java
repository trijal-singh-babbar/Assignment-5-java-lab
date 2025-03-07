import java.lang.*;
class Sphere extends Shape implements Volume
{
	public Sphere(double radius)
	{
		super(radius,0,0,0);	
	}
	
	public double calculateArea()
	{
		return 4 * 3.14 * (dim_one * dim_one);
	}
	
	public double calculatePerimeter()
	{ 
		return 2 * 3.14 *(dim_one);
	}
	
	public double calculateVolume()
	{
		return (4.0 / 3.0)* 3.14 * ((dim_one) * (dim_one) *(dim_one));
	}
}