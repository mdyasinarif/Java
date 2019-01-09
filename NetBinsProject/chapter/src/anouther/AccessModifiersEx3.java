
package anouther;

import AccessModifiar.anouther.*;


public class AccessModifiersEx3 {
   
    public static void main(String[] args) {
        AccessModifiersEx obj = new AccessModifiersEx();
        System.out.println(obj.privateVar);
        System.out.println(obj.defaultVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.publicVar);
    }
}
