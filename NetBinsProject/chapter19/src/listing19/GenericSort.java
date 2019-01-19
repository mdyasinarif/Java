

public class GenericSort {
    public static void main(String[] args) {
        
        Integer[] inArray = {new Integer(2),new Integer(4),new Integer(3)};//same as Integer[] inArray = {2, 4, 3};
        Double[] duArray = {new Double(3.4),new Double(1.3),new Double(-22.1)};//same as Double[] duArray = {3.4, 1.3, -22.1};
        Character[] chrArray = {new Character('A'),new Character('J'), new Character('R')};
        String[] stArray = {"Yasin","Sohan","Arif"};
        
        sort(inArray);
        sort(duArray);
        sort(chrArray);
        sort(stArray);
        
        System.out.println("Sorted Integer Objects: "); 
        printList(inArray);
        System.out.println("Sorted Double Objects: "); 
        printList(duArray);
        System.out.println("Sorted Character Objects: "); 
        printList(chrArray);
        System.out.println("Sorted String Objects: "); 
        printList(stArray);
        
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentminIndex;
        
        for (int i = 0; i < list.length-1; i++) {
            currentMin = list[i];
            currentminIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (currentMin.compareTo(list[j])>0) {
                    currentMin = list[j];
                    currentminIndex = j;
                    
                }
            }
            if (currentminIndex != i) {
                list[currentminIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void printList(Object[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
            
        }
        System.out.println();
    }
}
