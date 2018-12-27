
public class WhileLoop {
    public static void main(String[] args) {
        System.out.print("\nPrint 1 to 20 :");
        int i=1 ;
        while (i<=20) {            
            i++;
            System.out.print(i+" ");
        }
      
        System.out.print("\nPrint 1 to 20 except 5,10,15: ");
        int j = 1;
        while (j<=20) { 
            j++;
            if(j == 5 || j==10 || j==15){
             continue;   
            }
            System.out.print(j+" ");       
        }
        
        System.out.print("\nPrint 1 to 20 odd Number:");
        int h = 1;
        while (h<=20) { 
            h++;
            if(h%2==0){
            System.out.print(h+" ");
        }
                   
        }
        
        System.out.print("\nPrint 1 to 20 divided by 5");
        int h = 1;
        while (h<=20) { 
            h++;
            if(h%2==0){
            System.out.print(h+" ");
        }
                   
        }
        
    }
    
}
