
package Methods;

import java.util.Scanner;


public class FiveMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Fitst number :");
        int n1 = input.nextInt();
        System.out.print("Enter Second number ");
        int n2 = input.nextInt();
        System.out.print("Enter mode :");
        
        String mode = input.next();
        
        System.out.println(operateAll(n1, n2, mode));
        
        
    }
    public  static  int operateAll(int n1,int n2,String mode){
        int rs = 0;
        if (mode.equals("+")) 
            rs = add(n1,n2);
        else if (mode.equals("-"))
            rs = sub(n1,n2);
        else if (mode.equals("*"))
            rs = multi(n1,n2);
        else if (mode.equals("/"))
            rs = devid(n1,n2);
        else if (mode.equals("%"))
            rs = mod(n1,n2);
        return  rs;
    }
    public static int add(int n1, int n2){
        int rs = n1 + n2;
        return rs;
    }
    public static int sub(int n1, int n2){
        int  rs = n1 - n2;
        return   rs;
    }
    public static int multi(int n1, int n2){
        int  rs = n1 * n2;
        return  rs;
    }
    public static int devid(int n1, int n2){
        int  rs = n1 / n2;
        return  rs;
    }
    public static int mod(int n1, int n2){
        int  rs = n1 % n2;
        return  rs;
    }
}
