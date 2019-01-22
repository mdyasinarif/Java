/*
* there are two types of nested cladd non_static and Static
* the non static nested classed are also known as inner classes
* 1. non static nested class(inner class)
* a) Member inner class  //Declar into class body and outside the method
* B) Annomyous inner class // interface and abstract class
* c) Local inner class // Into a mathod

* 2. static nested class
Member Inner class A class created within class and outside method.
Example of menber inner class that is invoked inside a class
 */
package nestedClass;

/**
 *
 * @author Md Yasin Arif
 */
public class TestMemberOuter1 {
    private int data = 30;
    class Inner{// inner class
        void msg(){// inner class method
            System.out.println("Data is "+data);
        }
    }
    void display(){// class method 
       // TestMemberOuter1.Inner inn = new TestMemberOuter1.Inner();// other class 
        Inner inn = new Inner();
        inn.msg();
    }
    public static void main(String[] args) {
        TestMemberOuter1 ds = new TestMemberOuter1();
        ds.display();
    }
}

