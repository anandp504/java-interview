package org.sanketika.shapes;


public class Square extends Shapes{
	public Square(float side)
	{
		this.side=side;
	}
	
	
	  public float getArea()
	    {
	        return side * side;
	    }
	   public float getPerimeter() {
	    	return 4*side;
	    }
	
}