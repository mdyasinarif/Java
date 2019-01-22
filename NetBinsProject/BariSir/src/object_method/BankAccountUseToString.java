
package object_method;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Bank{
    String n ,add;
    int acn,bal;

    public Bank(String n, String add, int acn, int bal) {
        this.n = n;
        this.add = add;
        this.acn = acn;
        this.bal = bal;
    }

    @Override
    public String toString() {// pattarn to show output
       StringBuffer sb = new StringBuffer();
       sb.append("Customer name :");
       sb.append(this.n);
       sb.append(", ");
       sb.append("Address :");
       sb.append(this.add);
       sb.append(", ");
       sb.append("A/C no :");
       sb.append(this.acn);
       sb.append(", ");
       sb.append("Balance :");
       sb.append(this.bal);    
       return sb.toString();
    }

}

public class BankAccountUseToString {
    public static void main(String[] args) {
        List<Bank> l = new LinkedList<Bank>();
        
        Bank bl = new Bank("Yain", "Dhaka", 101, 10000);
        Bank b2 = new Bank("Arif", "Dhaka", 102, 20000);
        Bank b3 = new Bank("Sohan", "Dhaka", 103, 30000);
        l.add(bl);
        l.add(b2);
        l.add(b3);
        
        Iterator<Bank> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
    }
}
