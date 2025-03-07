class Sphere extends Shape
{
    public Sphere(double radius)
    {
        super(radius, 0, 0, 1); // A sphere has only 1 curved surface
    }

    // Method to calculate volume
    public double calculateVolume()
    {
        return (4.0 / 3.0) * 3.14 * Math.pow(dim_one, 3);
    }

    // Method to calculate surface area
    public double calculateSurfaceArea()
    {
        return 4 * 3.14 * dim_one * dim_one;
    }
}