
import java.util.Scanner;


public class CheckPoint4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 0    1   2   3   4   5   6   7   8   9   10  11  12  13  14  = length 15
        // W    e   l   c   o   m   e       t   o       J   a   v   a
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        
        System.out.println(" s1 == s2 \t " + (s1 == s2) );
        System.out.println(" s1 == s3 \t " + (s1 == s3) );
        System.out.println(" s1.equals(s2) \t " + s1.equals(s2) );
        System.out.println(" s1.equals(s3) \t " + s1.equals(s3) );
        System.out.println(" s1.compareTo(s2) \t " + s1.compareTo(s2) ); ///  w-p = (87-80)=7
        /*
        System.out.println((int)'W'); 87
        System.out.println((int)'P'); 80
        */
        
        System.out.println(" s2.compareTo(s3) \t " + s2.compareTo(s3) );
        System.out.println(" s2.compareTo(s2) \t " + s2.compareTo(s2) );
        System.out.println(" s1.charAt(0) \t " + s1.charAt(0) );
        System.out.println(" s1.charAt(11) \t " + s1.charAt(11) );
        System.out.println(" s1.indexOf('0',6) \t " + s1.indexOf('o',6) );
        System.out.println(" s1.indexOf('0',3) \t " + s1.indexOf('o',3) );
        System.out.println(" s1.indexOf(to) \t " + s1.indexOf("to"));
        System.out.println(" s1.lastIndexOf(a) \t " + s1.lastIndexOf('a') );
        System.out.println(" s1.lastIndexOf('o',6) \t " + s1.lastIndexOf('o',6) );
        System.out.println(" s1.lastIndexOf('o',15) \t " + s1.lastIndexOf('o',15) );
        System.out.println(" s1.length() \t " + s1.length() );
        System.out.println("  s1.substring(5) \t " + s1.substring(5) );
        System.out.println("  s1.substring(5,11) \t " + s1.substring(5,11) );// 5 start end (11-1) =10
        System.out.println("  s1.startsWith(Wel) \t " + s1.startsWith("Wel") );
        System.out.println("  s1.endsWith(\"Java\") \t " + s1.endsWith("Java") );
        System.out.println(" s1.toLowerCase() \t " + s1.toLowerCase() );
        System.out.println(" s1.toUpperCase() \t " + s1.toUpperCase());
        System.out.println(" s1.concat(s2) \t " + s1.concat(s2));
        System.out.println(" s1.contains(s2) \t " + s1.contains(s2));
        System.out.println("\"\\t Wel \\t\".trim()\t"+"\t Wel \t".trim());
        
        
    }
}
