
package tPiont;


public class TestJoinMethod3 extends Thread{

    
    public void run() {
        System.out.println("Running...");
    }
    public static void main(String[] args) {
        TestJoinMethod3 t1 = new TestJoinMethod3();
        TestJoinMethod3 t2 = new TestJoinMethod3();
        t1.setName("Yasin");
        System.out.println("Name of t1 : "+t1.getName());
    }
}
