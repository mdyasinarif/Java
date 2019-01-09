
package Llsting9_11.TatalArea;


public class CircleWithPrivateDataFields {
    double redius;

    public CircleWithPrivateDataFields(double x) {
       redius = x;
    }
    public double getArea(){
        return Math.pow(redius, 2)*3.1415;
    }
    public double getRedius(){
        return redius;
    }
            
        
    
    
}
