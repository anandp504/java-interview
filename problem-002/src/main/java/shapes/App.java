package org.sanketika.shapes;
import java.util.Scanner;

public class App{
	
	 void computeProperties (String choice) {
	    	switch (choice) {
			case "Rectangle":
				Rectangle rec = new Rectangle(4,5);
				System.out.println("The area of the Rectangle is : " + rec.getArea());
				System.out.println("The perimeter pf the rectangle is : " + rec.getPerimeter());
				break;
			case "Circle":
				Circle cir = new Circle(9);
				System.out.println("The area of the Circle is : " + cir.getArea());
				System.out.println("The perimeter pf the Circle is : " + cir.getPerimeter());
				break;
				
			case "Square":
				Square sq = new Square(8);
				System.out.println("The area of the Square is : " + sq.getArea());
				System.out.println("The perimeter pf the Square is : " + sq.getPerimeter());
				break;
				
          
			default:
				System.out.println("Run the program again, by entering valid input i.e Rectangle, Square or Circle");
				break;
			}
			
	    	
	    }
	
	
}