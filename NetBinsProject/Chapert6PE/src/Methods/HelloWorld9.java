
package Methods;

public class HelloWorld9 {
    public static void main(String[] args) {
        sayHello();
        System.out.println(sayHello("Hi"));
        System.out.println(sayHello("Hello ", "World"));
        System.out.println(sayHello("Woe ", 100));
        System.out.println(sayHello(100, " Woe"));
    }
// Methods  overload
    public static void sayHello(){// return kor ta para na void ti akhana Print kor ta hoba
        System.out.println("Hello World ===== 1 =====");
    }
    public static String sayHello(String s1){
        return s1;
    }
    public static String sayHello(String s1, String s2){
        return s1+s2;
    }
    public static String sayHello(String s1, int n1){
        return s1+n1;
    }
    public static String sayHello(int n1,String s1){
        return n1+s1;
    }
    
    
}
