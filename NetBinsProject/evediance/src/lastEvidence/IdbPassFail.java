
package lastEvidence;

import java.util.Scanner;


public class IdbPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mcq Marks : ");
        int mcq = sc.nextInt();
        
        System.out.print("Enter Descriptive Marks : ");
        int des = sc.nextInt();
        
        System.out.print("Ente Evidence Marks : ");
        int evi = sc.nextInt();
        
        int total = mcq+des+evi;
        if ((mcq+des)>= 70 && evi >= 30) {
            System.out.println("Your Pass");
            System.out.println("Total marks is "+total);
        } else {
            System.out.println("Your fail");
        }
        
        
    }
}
