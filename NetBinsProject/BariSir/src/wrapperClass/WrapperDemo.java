
package wrapperClass;


public class WrapperDemo {
    public static void main(String[] args) {
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer(35);
        //compareTo Demo object / type
        System.out.println("compareTo intObj1 +intObj2 :"+intObj1.compareTo(intObj2));
        System.out.println("compareTo intObj1 +intObj3 :"+intObj1.compareTo(intObj3));
        System.out.println("compareTo intObj3 +intObj1 :"+intObj3.compareTo(intObj1));
        //equals Demo value
        System.out.println("compareTo intObj1 +intObj2 :"+intObj1.equals(intObj2));
        System.out.println("compareTo intObj1 +intObj3 :"+intObj1.equals(intObj3));
        System.out.println("compareTo intObj3 +intObj1 :"+intObj3.equals(intObj1));
        
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        //compare valeue
        System.out.println("compare f1 and f2 "+Float.compare(f1, f2));
        System.out.println("compare f2 and f1 "+Float.compare(f2, f1));
        System.out.println("compare f1 and f3 "+Float.compare(f1, f3));
        
        // Addition of Integer with float
        
        Float f =  intObj1.floatValue()+f1;
        System.out.println("Addition of intObj1 and f1 "+ intObj1 + "+" +f1+" = "+f);
        
    }
}
