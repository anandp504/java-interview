package shapes;

public class Square extends Shapes{

    @Override
    protected int perimeter() {
        
        return 4*length;
        
    }

    @Override
    protected int area() {
        return length * length;
    }
    
}
