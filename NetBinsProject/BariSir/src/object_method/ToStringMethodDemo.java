
package object_method;


public class ToStringMethodDemo {// auto extend object calss
    String s1,s2;

    public ToStringMethodDemo(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {// object ar method
        return "ToStringMethodDemo{" + "s1=" + s1 + ", s2=" + s2 + '}';
    }

    
    public static void main(String[] args) {
        ToStringMethodDemo tdf = new ToStringMethodDemo("Hello","World");
        System.out.println(tdf.s1 +tdf.s2);
        System.out.println(tdf);//no need to calling toString method
    }
    
}
