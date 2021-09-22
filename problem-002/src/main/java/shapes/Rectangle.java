package shapes;

public class Rectangle extends Shapes{

    double breadth;
    double length;
    
    Rectangle(){
        super();
    }

    Rectangle(double length, double breadth){
        super();
        this.breadth = breadth;
        this.length = length;
    }
    
    @Override
    double perimeter() {
        
        return 2*(length + breadth);
    }

    @Override
    double area() {
        
        return length * breadth;
        
    }

    
}
