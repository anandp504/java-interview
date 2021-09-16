package shapes;

public class App 
{
    public static void main( String[] args )
    {
        Shapes shape[] = new Shapes[3];
        shape[0] = new Rectangle();
        shape[1] = new Square();
        shape[2] = new Circle();

        
        computeProperties(shape[0]);
        
    }

    public static void computeProperties(Shapes shape)
    {
        System.out.println("Area : "+shape.area());
    	System.out.println("Perimeter : "+ shape.perimeter());
    	
    }   
}