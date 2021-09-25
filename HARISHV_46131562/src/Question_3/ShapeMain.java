package Question_3;

 public class ShapeMain 
 {
    public static void main(String[] args)
    {
        ShapesFactory sf = new ShapesFactory();
        sf.addShape(new Circle(10.2));
        sf.addShape(new Circle(11.2));
        sf.addShape(new Circle(12.2));
        sf.addShape(new Circle(13.2));
        sf.addShape(new Rectangle(13.2, 23));
        sf.addShape(new Rectangle(12, 23));
        Rectangle r = new Rectangle(12.2, 54);
        sf.addShape(r);

        System.out.println(sf.getCircles());
        System.out.println(sf.getRectangles());
        System.out.println(sf.deleteShape(r));
        System.out.println(sf.getRectangles());

    }
}