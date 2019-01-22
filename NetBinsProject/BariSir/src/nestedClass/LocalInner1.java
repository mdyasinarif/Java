/*Local inner class
* A class that is created inside a method is known as local inner class.
* If you want to invoke the methods of local inner class
you must instantiate this class inside the methods
    1) Local inner class cannot be invoked frome outside the method.
    2) Local inner class cannot access non_final local variable.
 * 
 */
package nestedClass;


public class LocalInner1 {
    private int x = 10;
    
    void display(){// method
         int a = 50;
        class Local{// inner class
            int y = 20;
              void msg(){// inner method
                  int z = 30;
                  System.out.println("instance variable x ="+x);
                  System.out.println("Outer Mathod variable a = "+a);
                  System.out.println("Inner calss variable y = "+y);
                  System.out.println("Inner mathod variable z = "+z);
              }
        }
        Local l = new Local();// inner mathod calll into the Main method 
        l.msg();
    
    }
    public static void main(String[] args) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }
}
