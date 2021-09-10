package org.sanketika.shapes;

public class Rectangle extends Shapes{
	public Rectangle(float length, float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public float getArea()
	{
    return length * breadth;
	}

	public float getPerimeter() {
	float res =length+breadth;
	return 2*res;
}
}