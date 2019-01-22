
package nestedClass;
// able thak la interface
interface Eatable{
    void eat();
}

public class TestAnnomyousInnerInterface {// implement kora o make kora jay
    public static void main(String[] args) {
        // inner class ar madoma implement kora hoy sa
      new Eatable() {// object creation 
            @Override
            public void eat() {
                System.out.println("Nice Fruits");
            }
        }.eat();
    }
}
