/**
 * Tyler McMahon
 *Retail item
 *Programming 3 APCS
 *Date 
 */
public class retailItem {
        
        private String description;
        private int unitsOnHand;
        private double price;
        
        /**
         * retail item class constructor
         * 
         */
        public retailItem(String d, int u, double p){
            description = d;
            unitsOnHand = u;
            price = p;
                    
        }
        /**
         * the setDescription method accepts an argument
         * that is stored in the description field
         */
        public void setDescription(String d){
            description = d;
        }
        
        /**
         * the setUnitsOnHand method accepts an argument 
         * that is stored in the unitsOnHand field
         */
        public void setUnitsOnHand(int u){
            unitsOnHand = u;
        }
        
        /**
         *the setPrice method accepts an argument
         * that is stored in the price field
         */
        public void setPrice(double p){
            price = p;
        }
        
     /**
     * the getDescription method returns the value
     * stored in the description field
     */
        public String getDescription(){
            return description;
        }
        
        /**
         * the getUnitsOnHand method returns the value
         * stored in the unitsOnHand field
         * @return 
         */
        public int getUnitsOnHand(){
            return unitsOnHand;
        }
        
        /**
         * the getPrice method returns the value
         * stored in the price field
         */
        public double getPrice(){
            return price;
        }
        
    }


