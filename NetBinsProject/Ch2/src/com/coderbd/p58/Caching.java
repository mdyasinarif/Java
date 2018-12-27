/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.p58;

/**
 *
 * @author User
 */
public class Caching {
    public static void main(String[] args) {
        // byte, short, int, float, long, double
        byte byteVar = 127;
         long x = 10;
         int y = 15;
         long rs = x+y;
         System.out.println("Rs :"+rs);
         
         int result = (int) x+y;
         System.out.println("result :"+result);
    }
    
}
