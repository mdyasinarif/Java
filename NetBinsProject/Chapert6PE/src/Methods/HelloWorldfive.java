
package Methods;




public class HelloWorldfive {
    public static void main(String[] args) {
        System.out.println(sayHello("A","B"));
    }
    public static String sayHello(String s1, String s2){// parametter create kora value pass kora
        String msg = s1 + s2;
        return msg;
    }
    public static String sayHello(int n1, int n2){// parametter create kora value pass kora
        String msg = String.valueOf(n1)+String.valueOf(n1);
        return msg;
    }
    public static long sayHello(long n1, long n2){// parametter create kora value pass kora
        long rs = n1 + n2;
        return rs;
    }
    
}
