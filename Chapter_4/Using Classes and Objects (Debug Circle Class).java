public class  DebugCircle 
{
    private int radius;
    private int diameter;
    private final double PI = 3.14159

    public DebugCircle (int radius)
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
    {
        return diameter;
    }

    public double getArea()
    {
        return area;
    }
}

/*
 - removed incorrect semicolon from getRadius() method declaration
 - fixed typo: changed 'radiuss' to 'radius' in getRadius()
 - changed return type of getDiameter() from void to int 
 */