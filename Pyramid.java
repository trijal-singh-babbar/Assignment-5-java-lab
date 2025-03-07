// Pyramid.java

class Pyramid extends Shape
{
    public Pyramid(double base, double height)
    {
        super(base, height, 0, 5); // 5 faces (1 base + 4 triangular faces)
    }

    // Method to calculate volume
    public double calculateVolume()
    {
        return (1.0 / 3.0) * (dim_one * dim_one) * dim_two;
    }

    // Method to calculate slant height
    public double calculateSlantHeight()
    {
        return Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_two * dim_two);
    }

    // Perimeter of the base (square)
    public double calculateBasePerimeter()
    {
        return 4 * dim_one;
    }

    // Total perimeter including edges
    public double calculateTotalPerimeter()
    {
        double slantHeight = calculateSlantHeight();
        double sideEdge = Math.sqrt((dim_one / 2) * (dim_one / 2) + slantHeight * slantHeight);
        return 4 * (dim_one + sideEdge);
    }

    // Surface Area = Base Area + Lateral Area
    public double calculateSurfaceArea()
    {
        double slantHeight = calculateSlantHeight();
        return (dim_one * dim_one) + (2 * dim_one * slantHeight);
    }
}
