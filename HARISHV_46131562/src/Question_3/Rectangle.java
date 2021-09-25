package Question_3;

public class Rectangle extends Shape 
{
    private double length, breadth;
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    double area() 
    {
        return length * breadth;
    }
    public String toString() 
    {
        return "Rectangle [breadth=" + breadth + ", length=" + length + ", Area=" + area() + "]";
    }
}
