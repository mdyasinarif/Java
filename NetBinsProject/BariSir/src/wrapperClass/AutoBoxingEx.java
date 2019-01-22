
package wrapperClass;


public class AutoBoxingEx {
    public static void main(String[] args) {
        int pInt = 420;
        Integer wInt = new Integer(pInt); // this is called boxing
        int p2 = wInt;// thid is called unboxing
        System.out.println(p2);
    }
}
