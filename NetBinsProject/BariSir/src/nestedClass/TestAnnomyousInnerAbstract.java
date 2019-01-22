
package nestedClass;

abstract class Person{
    abstract void eat();

}
public class TestAnnomyousInnerAbstract {
    public static void main(String[] args) {
        new Person() {
            @Override
            void eat() {
                System.out.println("Nince Fruits");
            }
        }.eat();
    }
}
