/**
 * Tyler McMahon
 *Widget Factory
 *Programming 3 APCS
 *10/2/19 
 */
public class widgetFactory {

       private double mustProduce;
        double widgetProduction;
       
        //Widget factory constructor
       public widgetFactory(int m){
           mustProduce = m;
       }
       
       /**
        * The setMustProduce method accepts the argument
        * and stores it in the mustProduce field
        */
       public void setMustProduce(int m){
           mustProduce = m;
       }
       
       /**
        * the SetWidgetProduction method calculates and stores
        * the value in the widgetProduction field
        */
       public void setWidgetProduction(){
            widgetProduction = mustProduce / 160;
       }
       
       /**
        * The getMustProduce method returns the stored value
        * in the mustProdyce field(attribute)
        */
       public double getMustProduce(){
           return widgetProduction;
       }
         
       
}
