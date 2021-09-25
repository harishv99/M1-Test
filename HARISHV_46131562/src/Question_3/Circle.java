package Question_3;

public class Circle extends Shape 
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    double area() 
    {
        return Math.PI * radius * radius;
    }
    public String toString()
    {
        return "Circle [radius=" + radius + ", Area=" + area() + "]";
    }

}