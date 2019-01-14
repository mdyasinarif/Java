
package fildVariable;

import java.util.Date;


public class FiendInitialixeEx {
    double a;
    Date b = new Date();
    String s;

    public FiendInitialixeEx(String s) {
        this.s = s;
    }
    
    public static void main(String[] args) {
        FiendInitialixeEx obj = new FiendInitialixeEx("Sohan");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.s);
    }
}
