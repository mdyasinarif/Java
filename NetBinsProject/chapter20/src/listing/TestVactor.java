
package listing;

import java.util.Enumeration;
import java.util.Vector;

public class TestVactor {
    public static void main(String[] args) {
        Vector <String> v = new Vector <String>();
        v.add("Yasin");
        v.addElement("Arif");
        v.addElement("Sohan");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
