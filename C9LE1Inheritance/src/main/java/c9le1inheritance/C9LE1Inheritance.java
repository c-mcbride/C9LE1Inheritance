package c9le1inheritance;

/**
 *
 * @author calif
 */
public class C9LE1Inheritance 
{

    public static void main(String[] args)
    {
       Motorcycle myBike = new Motorcycle ("coolboi", "The Over Compensator 5000");
       myBike.popWheelie();
       myBike.getModel();
       
       System.out.println(myBike.getModel());
       
       Car myCar = new Car ("Ford" , "Escape");
       myCar.openMoonRoof();
    }
    
}
