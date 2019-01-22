
package conatactor;

import java.util.Date;


public class Constactor {
   // global + field variable 
    double a;// 1. Initialization using default value;
    Date b = new Date();// 2. Initialization using expict value system current date
    String s;//3. Initialization using by concstructor
    
    // default constarctor
    public Constactor() {
    }

    public Constactor(double a) {
        this.a = a;
    }

    public Constactor(String s) {
        this.s = s;
    }

    public Constactor(double a, String s) {
        this.a = a;
        this.s = s;
    }
    public Constactor(String s,double a) {
        this.a = a;
        this.s = s;
    }
    public static void main(String[] args) {
        //Constactor obj = new Constactor(); object creater kora Constructor call dawa
        
        Constactor obj = new Constactor();
        System.out.println(obj.a);
        Constactor objA = new Constactor(50);
        System.out.println(objA.a);
        Constactor objS = new Constactor("Sohan");
        System.out.println(objS.s);
        Constactor objDS = new Constactor(50,"Sohan");
        System.out.println(objDS.a+" " +objDS.s);
        Constactor objSD = new Constactor("Sohan",50);
        System.out.println(objSD.s+" " +objDS.a);
    }
}
