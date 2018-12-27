
import java.util.Scanner;


public class AreaOfTriangel2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three point for Triangle : ");
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double sider1 = Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2), 0.5);
        double sider2 = Math.pow(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2), 0.5);
        double sider3 = Math.pow(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2), 0.5);
        
        double s = (sider1+sider2+sider3)/2;
        
        double area = Math.pow(s*(s-sider1)*(s-sider2)*(s-sider3), 0.5);
        
        System.out.println("The Area of the Triangle : "+area);
        
        
    }
    
}
