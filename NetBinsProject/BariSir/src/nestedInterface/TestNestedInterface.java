
package nestedInterface;


public class TestNestedInterface implements Displayable.Massage{

    @Override
    public void msg() {
        System.out.println("Hello nested Interface");
    }
    public static void main(String[] args) {
        Displayable.Massage massage = new TestNestedInterface();
        massage.msg();
        
    }
}
