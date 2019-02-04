package ClassPatice;

import java.util.Scanner;

public class IdbPassFail {
    public static void main(String[] args) {
        result();
    }
    public static void  result(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Despriptive Marks : ");
        int des = sc.nextInt();
        
        System.out.print("Enter McQ Marks : ");
        int mcq = sc.nextInt();
        
        System.out.print("Enter Evediance Marks : ");
        int evd = sc.nextInt();
        
        if ((des+mcq) >= 70 && evd >= 30) {
            System.out.println("Your are Pass");
        } else {
             System.out.println("Your are Fail");
        }
    
    
    }
}
