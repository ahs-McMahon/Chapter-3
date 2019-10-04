/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 992005972
 */
class Car {
    private int carModel;
    private String make;
    private int speed;
    int accelerate = speed + 5;
    int brake = speed - 5;
    
    
    /**
     * car class constructor
     */
     
    public Car (int c, String m, int s){
        carModel = c;
        make = m;
        speed = s;

    }
    
    /**
     * the setCarModel method accept an argument 
     * that is stored in the carModek field (attributes)
     */
   public void setCarModel(int m){
       carModel = m;
   } 
   
   /**
     * the setMake method accept an argument 
     * that is stored in the make field (attributes)
     */
   public void setMake(String m){
       make = m;
   }
   
   /**
     * the setSpeed method accept an argument 
     * that is stored in the speed field (attributes)
     */
   public void setSpeed(int s){
       speed = s;
   }
   
   /**
    * the setAccelerate method accept an argument 
    * that is stored in the accelerate field
    */
   public void setAccelerate(){
      speed+=5;
   }  
   
   /**
    * the setBrake method accepts an 
    * argument that is stored in the brake field
    */
   public void setBrake(){
      speed-=5;
   }
   
   /**
     * the getCarModel method returns the value
     * stored in the carModel field
     */
   public int getCarModel(){
       return carModel;
   }
   
   /**
     * the getMake method returns the value
     * stored in the make field
     */
   public String getMake(){
       return make;
   }
   
   /**
     * the getSpeed method returns the value
     * stored in the speed field
     */
   public int getSpeed(){
       return speed;
   }
   
}
