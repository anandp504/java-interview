package org.sanketika.shapes;

public class Circle extends Shapes{
	
	public Circle(float radius)
	{
		this.radius=radius;
	}
	
	 
	  public float getArea()
	    {
	        return (22/7) * radius * radius;
	    }
	    public float getPerimeter() {
	    	return (22/7)*2*radius;
	    }
	
}