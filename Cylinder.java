class Cylinder extends Shape
{
    public Cylinder(double radius, double height)
    {
        super(radius, height, 0, 3); // A cylinder has 3 faces (2 circular bases + 1 curved surface)
    }

    // Method to calculate volume
    public double calculateVolume()
    {
        return Math.PI * dim_one * dim_one * dim_two;
    }

    // Method to calculate lateral surface area
    public double calculateLateralSurfaceArea()
    {
        return 2 * Math.PI * dim_one * dim_two;
    }

    // Method to calculate total surface area
    public double calculateSurfaceArea()
    {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }
}