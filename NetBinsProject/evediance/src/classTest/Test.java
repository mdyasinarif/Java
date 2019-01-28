
package classTest;


public class Test {
    public static void main(String[] args) {
         A a = new A();
         a.display();
         A b = new B();
         b.display();
         A c = new C();
         c.display();
//         C d = new C();
//         d.display();
         
    }
    
    
    
}
class A{
        public static  void display(){System.out.println("A");}
}
class B extends A {
    public static void display(){System.out.println("B");}
}
class C extends B{
    public static void display(){System.out.println("C");}
}
