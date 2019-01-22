/*
 * Static nested class
    A static class that is created inside a class is knoen as static class
    it can access static data member of outer class including private.

* static nested class cannot access non-static (intance) data membe or me
 */
package nestedClass;

/**
 *
 * @author Md Yasin Arif
 */
public class TestStatic1 {
    static int x = 30;
    
    static  class Inner{
        void msg(){
            System.out.println( "Non Static X :"+x);
        }
    
        static void msg2(){
            System.out.println("Static X :"+x);
        }
        
        public static void main(String[] args) {
            Inner obj = new Inner();
            obj.msg();
            Inner.msg2();// no need to the instance of static nestated class
        }
    
    }
}
