
package tutrial.p1;

public class Box {
    double height, width,depth;
    
    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }
    void displayVol(){
        double vol = height * width * depth;
        System.out.println("Total vol is :"+vol);
    }
}
