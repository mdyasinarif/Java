
package lastEvidence;


public class Random {
    public static void main(String[] args) {
        
        int  n1 = (int) (50+(Math.random()*50));// range 1 to 100
        int  n2 = (int) ((Math.random()*100));// range  100
        
        System.out.println(n1);
        System.out.println(n2);
    }
}
