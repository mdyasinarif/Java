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
public class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
    
    // way 1 default constactor and setter method

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsScienceMajor(boolean isScienceMajor) {
        this.isScienceMajor = isScienceMajor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Student(String name, int age, boolean isScienceMajor, char gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
    }
    
    
}
