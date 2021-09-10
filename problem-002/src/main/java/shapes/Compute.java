package org.sanketika.shapes;

import java.util.Scanner;
public class Compute{
	public static  void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Rectangle, Square or Circle : ");
		String choice = s.nextLine();	
		App app=new App();
		app.computeProperties(choice);
	}
	


}