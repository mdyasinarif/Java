
package nestedClass;


public class LocalVariable2 {
    private int x = 100;// inisial variable
    void display(){
        int y = 200;// local variable
        class Local{
            void msg(){
                System.out.println(y);
            }
        }
        Local l = new Local();
        l.msg();
        
    }
    public static void main(String[] args) {
        LocalVariable2 obj = new LocalVariable2();
        obj.display();
    }
}
