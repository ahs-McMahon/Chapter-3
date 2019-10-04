/**
 * Tyler McMahon
 *CH3PC4
 *Programming 3 APCS
 *Date 
 */
public class RetailItemDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //create retail item object
    retailItem retailItemOne = new  retailItem("Jackets ", 12, 59.95);
    
    //creating item two
    retailItem retailItemTwo = new retailItem("Designer jeans ", 40, 34.95);
    
    //creating item three
    retailItem retailItemThree = new retailItem("Shirts", 20, 24.95);
    
    
    //print out item one
        System.out.println(retailItemOne.getDescription() + "\t" + 
                retailItemOne.getUnitsOnHand() + "\t" + 
                retailItemOne.getPrice());
    
        //print out item two
         System.out.println(retailItemTwo.getDescription() + "\t" + 
                retailItemTwo.getUnitsOnHand() + "\t" + 
                retailItemTwo.getPrice());
         
         //print out item three
         System.out.println(retailItemThree.getDescription() + "\t" + "\t" +
                retailItemThree.getUnitsOnHand() + "\t" +
                retailItemThree.getPrice());
    }

}
