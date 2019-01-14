
package array;

import java.util.List;

class Account{
    int a;
    String b;

    public Account(int a, String b) {
        this.a = a;
        this.b = b;
    }
    public void showData(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class ObjectArray {
    public static void main(String[] args) {
        Account obj[] = new Account[2];
        obj[0] = new Account(1, "Dhaka");
        obj[0].showData();
        obj[1] = new Account(2, "Cummila");
        obj[1].showData();
        
      // Account obj2[] = {"DD"},{"AA"},{"CC"};
      
     
    }
    
}
