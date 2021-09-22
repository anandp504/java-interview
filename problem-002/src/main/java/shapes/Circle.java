package shapes;

public class Circle extends Shapes {

    double radius;

    Circle(double radius){
        super();
        this.radius = radius;
    }

    Circle(){
        super();
    }
    
    @Override
    double perimeter() {
        
        
        Float pi = 3.14f;

        return (int) (2 * pi * radius);
        
    }

    @Override
     double area() {
        
        Float pi = 3.14f;
        return (int) (pi * radius * radius);
    }
    
}
