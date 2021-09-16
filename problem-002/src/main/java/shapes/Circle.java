package shapes;

public class Circle extends Shapes {

    @Override
    protected int perimeter() {
        
        Float pi = 3.14f;

        return (int) (2 * pi * length);
        
    }

    @Override
    protected int area() {
        
        Float pi = 3.14f;
        return (int) (pi * length * length);
    }
    
}
