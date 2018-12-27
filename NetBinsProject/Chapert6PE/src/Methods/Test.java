
package Methods;


public class Test {
    public static void main(String[] args) {
        System.out.println(makeCal(5, 10));
        System.out.println(makeCal(5.3, 10.7));
        System.out.println(makeCal(10, 2.5));
        System.out.println(makeCal(57896423, 1259));
        
    }
    public static int makeCal(int n1, int n2){
        int rs = n1 + n2;
        return rs;
    }
    public static double  makeCal(double n1, double  n2){
        double  rs = n1 - n2;
        return  rs;
    }
    public static double makeCal(int n1, double  n2){
        double  rs = n1 * n2;
        return  rs;
    }
    public static double makeCal(double  n1, int  n2){
        double  rs = n1 / n2;
        return  rs;
    }
    public static long makeCal(long  n1, long  n2){
        long  rs = n1 % n2;
        return  rs;
    }
}
