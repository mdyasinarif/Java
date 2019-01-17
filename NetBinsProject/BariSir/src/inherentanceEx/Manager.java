
package inherentanceEx;

class Employee{
    public String name;
    public  int employeeid;

    public Employee() {
        this.employeeid = 1;
        this.name = "Yasin";
    }
    
    
    public Employee(int employeeid,String name) {
        this.employeeid = employeeid;
        this.name = name;
    }

   
    String getDetails(){
       return "Id is "+ employeeid + " and name is  "+name;
   }
    
    
}
public class Manager extends  Employee{
    public String department;

    public Manager(String department) {
        this.department = department;
    }

    public Manager( int employeeid, String name,String department) {
        super(employeeid, name);
        this.department = department;
    }
    @Override
    String getDetails(){
       return "subdetails";
   }
    public static void main(String[] args) {
        Manager mgr = new Manager(1, "Mr Arif", "IT");
        mgr.print();
        Employee e = new Manager(2, "Sohan", "B");
        mgr = (Manager)e;
        System.out.println(mgr.getDetails());
    }
    void print(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+employeeid);
        System.out.println("Department = "+department);
    }
   

   
    
    
}
