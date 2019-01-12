/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessing10_10;

/**
 *
 * @author User
 */
public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Stucture");
        Course course2 = new Course("Database System");

        course1.addStudent("Yasin Arif");
        course1.addStudent("Sohan Mohon");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of sutdents :" + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.println("Number of students in corse2 :" + course2.getNumberOfStudents());

        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }

    }
}
