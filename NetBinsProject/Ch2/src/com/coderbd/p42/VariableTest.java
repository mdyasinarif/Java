
package com.coderbd.p42;

import static java.lang.Math.PI;


public class VariableTest {
    static final double  PI = 3.1416;
    static double salary = 500.25;
    String CAPITAL_OF_DB = "Dhaka"; 
    
    public static void main(String[] args) {
        salary = 50000.15;
        PI = 4.58987;
        VariableTest obj = new VariableTest();
        obj.CAPITAL_OF_DB = "GopalGong";
    }
    
}
