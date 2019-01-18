
package ClassPatice;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number x:");
        int x = sc.nextInt();
        System.out.print("Enter number y:");
        int y = sc.nextInt();
        int s = sum(x,y);
        System.out.println("sum :"+s);
    }
    public static int sum(int x,int y){
        if(x < 0 || y > -1 ){
            System.out.println("Invalid Data");
        }
        return x+y;
    }
}
