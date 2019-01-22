
package fildVariable;

import java.util.Date;


public class FiendInitialixeEx {
    // global + field variable 
    double a;// 1. Initialization using default value;
    Date b = new Date();// 2. Initialization using expict value system current date
    String s;//3. Initialization using by concstructor

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
