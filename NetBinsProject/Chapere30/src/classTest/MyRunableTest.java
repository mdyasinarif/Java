
package classTest;

public class MyRunableTest {
    public static void main(String[] args) {
     Myrunable mr = new Myrunable();// myrunable ar class make kor ta hoba
     Thread t = new Thread(mr);
     //Thread t = new Thread(new Myrunable());// alternative Way
     t.start();
       
        
    }
}
