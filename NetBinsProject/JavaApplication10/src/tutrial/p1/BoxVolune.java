/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutrial.p1;

/**
 *
 * @author Md Yasin Arif
 */
public class BoxVolune {
    public static void main(String[] args) {
        
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(20,30,10);
        
        box1.displayVol();
        box2.displayVol();
    }
}
