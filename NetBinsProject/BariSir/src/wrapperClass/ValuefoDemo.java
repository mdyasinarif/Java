
package wrapperClass;


public class ValuefoDemo {
    public static void main(String[] args) {
        
        Integer intWrapper = Integer.valueOf("12345");
        // Conerting from binary to decimal
        Integer inWrapper2 = Integer.valueOf("11011", 2);
         //Converting from hexadecimal to decimal
        Integer inWrapper3 = Integer.valueOf("15", 8);
        //Converting from hexadecimal to decimal
        Integer inWrapper4 = Integer.valueOf("D", 16);
        
        System.out.println("12345 Decimal to Decimal Value "+intWrapper);
        System.out.println("11011 Binary to Decimal Value "+inWrapper2);
        System.out.println("15 Octal to Decimal Value "+inWrapper3);
        System.out.println("D hexadecimal to Decimal Value "+inWrapper4);
        
        System.out.println("Decimal to 12345 Hex "+Integer.toHexString(10));
        System.out.println("Decimal to 12345 Binary "+Integer.toBinaryString(10));
        System.out.println("Decimal to 12345 Octal "+Integer.toOctalString(10));
        
       
        
    }
}
