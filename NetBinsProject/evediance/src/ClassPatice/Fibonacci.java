
import java.util.Scanner;



public class Fibonacci {
    public static void main(String[] args) {
        fibo();
    }
    public static void fibo(){
        
        System.out.println("Fibonacci Serice are ");
       
       int a , b ,c ;
        for ( a = 0 , b = 1 , c = 0; c<=100; a = b, b = c, c = a+b) {
            System.out.println(c);
        }
        
}
}