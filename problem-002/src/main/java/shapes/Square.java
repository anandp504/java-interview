package shapes;

public class Square extends Shapes{

    double side;
    Square(){
        super();
    }

    Square(double side){
        super();
        this.side = side;
    }
    @Override
    double perimeter() {
        
        return 4*side;
        
    }

    @Override
    double area() {
        return side * side;
    }
    
}
