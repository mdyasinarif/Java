
import java.util.Scanner;


public class CheckPiont4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 "+(int)'1');
        System.out.println("A "+(int)'A');
        System.out.println("B "+(int)'B');
        System.out.println("a "+(int)'a');
        System.out.println("b "+(int)'b');
        
        
        System.out.println("40 = "+(char)40);
        System.out.println("59 = "+(char)59);
        System.out.println("79 = "+(char)79);
        System.out.println("85 = "+(char)85);
        System.out.println("90 = "+(char)90);
        System.out.println("90.0 = "+(char)90.0);
        
        System.out.println("40 = "+(char)0x40);
        System.out.println("5A = "+(char)0x5A);
        System.out.println("71 = "+(char)0x71);
        System.out.println("72 = "+(char)0x72);
        System.out.println("7A = "+(char)0x7A);
        
        System.out.println((int)(Math.random()*26 + 'a'));
        
        
        
    }
}
