/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing.Student;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        
        //------------------ way 1------------------------
        System.out.println("------------------ way 1------------------------");
        // object create
        Student student1 = new Student();
        
        // value assine
        student1.setName("Yasin");
        student1.setAge(27);
        student1.setIsScienceMajor(true);
        student1.setGender('M');
        
        // value print
        System.out.println("Name ? "+student1.name);
        System.out.println("Age ? "+student1.age);
        System.out.println("IsScienceMajor ? "+student1.isScienceMajor);
        System.out.println("Gender ? "+student1.gender);
        
        //------------------ way2------------------------
        System.out.println("------------------ way 2------------------------");
        
        Student student2 = new Student();
        student2.name = "arif";
        student2.age = 25;
        student2.isScienceMajor = true;
        student2.gender = 'M';
        
        System.out.println("Name ? "+student2.name);
        System.out.println("Age ? "+student2.age);
        System.out.println("IsScienceMajor ? "+student2.isScienceMajor);
        System.out.println("Gender ? "+student2.gender);
        
        
         //------------------ way3------------------------
         System.out.println("------------------ way 3------------------------");
        Student student3 = new Student("Sohan", 25, true, 'M');
        System.out.println("Name ? "+student3.name);
        System.out.println("Age ? "+student3.age);
        System.out.println("IsScienceMajor ? "+student3.isScienceMajor);
        System.out.println("Gender ? "+student3.gender);
        
         //------------------ way4------------------------
         System.out.println("------------------ way 4------------------------");
        Student student4 = new Student("Oli", 26, true, 'M');
        System.out.println("Name ? "+student4.name);
        System.out.println("Age ? "+student4.age);
        System.out.println("IsScienceMajor ? "+student4.isScienceMajor);
        System.out.println("Gender ? "+student4.gender);
    }
    
}
