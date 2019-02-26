/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticConstroctoNotPossible;

class StaticConst {

    public StaticConst() {//here static StaticConst() not possible
        System.out.println("super");
    }
}

public class StaticConsMain extends StaticConst {

    void someMethod() {
        System.out.println("method in sub");
    }

    public static void main(String[] args) {
        StaticConsMain staticConsMain = new StaticConsMain();
        staticConsMain.someMethod();
    }
}