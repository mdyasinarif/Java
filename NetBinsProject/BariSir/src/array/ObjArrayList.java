
package array;

import java.util.ArrayList;
import java.util.List;

public class ObjArrayList {
    private  int id;
    private  String name;
    private  int    mobile;
    private String email;

    public ObjArrayList(int id, String name, int mobile, String email) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

   static List<ObjArrayList> list = new ArrayList();
    ObjArrayList s1 = new ObjArrayList(201, "yasin", 01676555764, "yasin@gmail.com");
    ObjArrayList s2 = new ObjArrayList(202, "Arif", 01676555764, "yasin@gmail.com");
    ObjArrayList s3 = new ObjArrayList(203, "Sohan", 01676555764, "yasin@gmail.com");
    ObjArrayList s4 = new ObjArrayList(204, "Oli", 01676555764, "yasin@gmail.com");
   
    public static void main(String[] args) {
        for (ObjArrayList s : list) {
            System.out.println(s);  
        }
        
    }
    }

