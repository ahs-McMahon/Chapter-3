
/**
 * Tyler McMahon
 *CH3PC2
 *Programming 3 APCS
 *9/30/19 
 */
public class CarDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car c = new Car(0, "",0);
        c.setCarModel(20);
        c.setMake("");
        c.setSpeed(10);
        c.setAccelerate();
        c.setAccelerate();
        c.setAccelerate();
        c.setAccelerate();
        c.setAccelerate(); 
         System.out.println(c.getSpeed());
        
       
       c.setBrake();
        c.setBrake();
        c.setBrake();
        c.setBrake();
        c.setBrake();
        System.out.println(c.getSpeed());
    }
   
}
