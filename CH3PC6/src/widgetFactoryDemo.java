
/**
 * Tyler McMahon
 *Project Name
 *Programming 3 APCS
 *Date 
 */
public class widgetFactoryDemo {

    
    public static void main(String[] args) {
        
        //Create widgetFactory Object 
        widgetFactory w = new widgetFactory(320);
        
        
        w.getMustProduce();
        w.setWidgetProduction();
        
        /**
         * print out the amount of days it will take to produce
         * as many as need widget
        */
        System.out.println("It will take " + w.getMustProduce() + " day(s).");
    }

}
