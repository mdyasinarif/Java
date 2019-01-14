
package conatactor;

import java.util.Date;


public class Constactor {
    double a;
    Date b = new Date();
    String s;
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
        Constactor obj = new Constactor();
        Constactor objA = new Constactor(50);
        Constactor objS = new Constactor("Sohan");
        Constactor objDS = new Constactor(50,"Sohan");
        Constactor objSD = new Constactor("Sohan",50);
    }
}
