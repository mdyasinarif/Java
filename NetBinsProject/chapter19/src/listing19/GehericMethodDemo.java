
public class GehericMethodDemo {
    public static void main(String[] args) {
        Integer[] integer = {23,54,34,34};
        String [] string = {"Yasin","Arif","Sohan","Sovo"};
        
        GehericMethodDemo.<Integer>print(integer);
        GehericMethodDemo.<String>print(string);
    }
    public static <E> void print(E[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
}
