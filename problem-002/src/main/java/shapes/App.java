package shapes;

public class App 
{
    public static void main( String[] args )
    {
        Shapes shape[] = new Shapes[3];
        shape[0] = new Rectangle(1,1);
        shape[1] = new Square(1);
        shape[2] = new Circle(3);

        
        computeProperties(shape[2]);
        
    }

    public static void computeProperties(Shapes shape)
    {
        System.out.println("Area : "+shape.area());
    	System.out.println("Perimeter : "+ shape.perimeter());
    	
    }   
}