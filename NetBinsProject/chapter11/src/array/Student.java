package array;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int mobile;
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + '}';
    }
   
    public Student(int id, String name, int mobile, String email) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        Student s1 = new Student(201, "yasin", 01676555764, "yasin@gmail.com");
        Student s2 = new Student(202, "Arif", 01676555764, "yasin@gmail.com");
        Student s3 = new Student(203, "Sohan", 01676555764, "yasin@gmail.com");
        Student s4 = new Student(204, "Oli", 01676555764, "yasin@gmail.com");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println("Using Get");
        for (Student s : list) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getMobile() + " " + s.getEmail());
            
        }
         System.out.println();
         System.out.println("Using to String");
        for (Student s : list) {
            
            System.out.println(s);// to String

        }
        System.out.println();
        System.out.println(" norma");
        for (Student s : list) {
           
            System.out.println(s.id+" " +s.name+" " +s.mobile+" " +s.email);// normal
        }

    }
}
