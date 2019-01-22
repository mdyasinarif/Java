
package instanceVsStaticVarianble;


public class VariableEx {
    int c = 30;// instance variable
    int d = 40;
    static  int a = 10;//static variable
    {
        System.out.println("Second block lavel C:"+c);
    }
    
    public static void testMethords(){
        int b = 20;// local variable
        System.out.println("Last Methods B :"+b);
        
    }
    
    public static void main(String[] args) {
        System.out.println("First  Static  A:"+a);
        VariableEx v = new VariableEx();
        v.testMethords();
    }
    {
        System.out.println("Second block lavel:"+d);
    }
}
