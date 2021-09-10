package org.sanketika.shapes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void test() {
		
		Rectangle rec = new Rectangle(4,5); 
		Circle cir = new Circle(9);
		Square sq = new Square(8);
		
		float RecA = rec.getArea();
		assertEquals(20.0,RecA);	
		float RecP = rec.getPerimeter();
		assertEquals(18.0,RecP);
		
		float SqA = sq.getArea();
		assertEquals(64.0,SqA);	
		float SqP = sq.getPerimeter();
		assertEquals(32.0,SqP);
		
		float CirA = cir.getArea();
		assertEquals(243.0,CirA);
		float CirP = cir.getPerimeter();
		assertEquals(54.0,CirP);
		
	}

}
