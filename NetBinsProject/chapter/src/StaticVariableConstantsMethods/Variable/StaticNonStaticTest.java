
package StaticVariableConstantsMethods.Variable;


public class StaticNonStaticTest {
    
    public static void main(String[] args) {
        System.out.println(StaticNonStatic.y);
        
        StaticNonStatic obj2 = new StaticNonStatic();
        System.out.println("X :"+obj2.y);
        
    }
    
}
