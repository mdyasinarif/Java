
package interfaceEx;


public class TestImplement implements TestA,TestB{
    public static void main(String[] args) {
        TestImplement ti = new TestImplement();
        ti.print();
    }
    
    
    // implements so must be overried
    @Override
    public void print() {
        System.out.println("Printing......");
        System.out.println(a);
    }

    @Override
    public void printx() {
     
    }

    
}
