
package StaticVariableConstantsMethods.Variable;


public class StaticNonStatic {
    int x;
    static int y = 20;
    public static void main(String[] args) {
        StaticNonStatic obj1 = new StaticNonStatic();
        System.out.println("x :"+obj1.x);
        System.out.println("y :"+y);
        
    }
}
