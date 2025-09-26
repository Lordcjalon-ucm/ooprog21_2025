public class DebugCircle
{
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public DebugCircle(int r)
    {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    public int getRadius()
    {
        return radius;
    }

    public int getDiameter()
    {s
        return diameter;
    }

    public double getArea()
    {
        return area;
    }
}

/*
Bugs Found:
1. Removed semicolon after getRadius()
2. Corrected typo "radious" to "radius"
3. Changed getDiameter() return type to int
*/
