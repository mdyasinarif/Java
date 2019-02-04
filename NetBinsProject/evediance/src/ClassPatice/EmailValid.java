package ClassPatice;

import java.util.Scanner;

public class EmailValid {

    public static void main(String[] args) {
         emailVal();
    }

   public static  void emailVal(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Your Email : " );
       String emal = sc.nextLine();
       
       int adpos = emal.indexOf("@");
       int dotpos = emal.indexOf(".");
       
       if (adpos >  0 && dotpos < emal.length() -1 && adpos < dotpos -1) {
           System.out.println("Email is valid");
       } else {
            System.out.println("Email is Invalid");
       }
   
   }
}
