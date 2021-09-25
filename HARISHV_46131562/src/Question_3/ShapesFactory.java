package Question_3;

import java.util.ArrayList;
import java.util.List;

public class ShapesFactory 
{
	ArrayList<Shape> slist = new ArrayList<>(); 

	    public ShapesFactory() {}
        public void addShape(Shape s)
        {
	        slist.add(s);
	    }
        public List<Circle> getCircles() 
        {
	        ArrayList<Circle> circle = new ArrayList<>();
	        for (Shape s : slist)
	        {
	            if (s instanceof Circle)
	                circle.add((Circle) s);
	         }
	        return circle;
	    }

	    public List<Rectangle> getRectangles() 
	    {
	        ArrayList<Rectangle> rectangle = new ArrayList<>();
	        for (Shape s : slist) 
	        {
	            if (s instanceof Rectangle)
	                rectangle.add((Rectangle) s);
	        }
	        return rectangle;

	    }
        public boolean deleteShape(Shape s)
        {

	        if (slist.contains(s)) 
	        {
	            slist.remove(s);
	            return true;
	        }
	        return false;
	    }
	}

