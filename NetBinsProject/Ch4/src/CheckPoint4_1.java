
import java.util.Scanner;


public class CheckPoint4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("sqrt "+Math.sqrt(4));
        System.out.println("sin "+Math.sin(2 * Math.PI));
        System.out.println("cos "+Math.cos(2*Math.PI));
        System.out.println("pow "+Math.pow(2,2));
        System.out.println("log "+Math.log(Math.E));
        System.out.println("exp "+Math.exp(1));
        System.out.println("max "+Math.max(2,Math.min(4,3)));
        

        System.out.println("round 2.5 = "+Math.round(2.5));
        System.out.println("rint 2.5 = " +Math.rint(2.5));
        System.out.println("ceil 2.5 = "+Math.ceil(2.5));
        System.out.println("floor 2.5 = "+Math.floor(2.5));
        
        System.out.println("round 2.51 = "+Math.round(2.5));
        System.out.println("rint 2.51 = "+Math.rint(2.51));
        System.out.println("ceil 2.51 = "+Math.ceil(2.51));
        System.out.println("floor 2.51 = "+Math.floor(2.51));
        
        System.out.println("round -2.5 = "+Math.round(-2.5));
        System.out.println("rint -2.5 = "+Math.rint(-2.5));
        System.out.println("ceil -2.5 = "+Math.ceil(-2.5));
        System.out.println("floor -2.5 = "+Math.floor(-2.5));
        
        System.out.println("round -2.51 = "+Math.round(-2.51));
        System.out.println("rint -2.51 = "+Math.rint(-2.51));
        System.out.println("ceil -2.51 = "+Math.ceil(-2.51));
        System.out.println("floor -2.51 = "+Math.floor(-2.51));
        
       System.out.println("round -2.5f= "+Math.round(-2.5f));
       System.out.println("round 2.5f= "+Math.round(2.5f));
       System.out.println("round -2.5= "+Math.round(-2.5));
       
       System.out.println("round + abs -2.5 = "+Math.round(Math.abs(-2.5)));
       
        System.out.println("Yasin arif \\sohan");
        
        char ch = (char) 65.25;
        System.out.println(ch);
        
        int i = (int)'A';
        System.out.println(i);
    }
}
