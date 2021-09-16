package shapes;

public class Rectangle extends Shapes{

    int breadth = 1;
    
    @Override
    protected int perimeter() {
        
        return 2*(length + breadth);
    }

    @Override
    protected int area() {
        
        return length * breadth;
        
    }

    
}
