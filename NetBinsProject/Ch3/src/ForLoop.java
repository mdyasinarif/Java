public class ForLoop {
    public static void main(String[] args) {
   System.out.print("\nPrint 1 to 20 :");
   for(int i = 1;i<=20;i++){
       System.out.print(i+" ");
   }
   
   System.out.print("\nPrint 1 to 20 except 5,10,15:");
   for(int i = 1;i<=20;i++){
       if(i==5 || i==10 || i==15){
       continue;
       }
       System.out.print(i+" ");
   }
   
   System.out.print("\nPrint 1 to 20 odd Number:");
   for(int i = 1;i<=20;i++){
       if(i%2==0){
        System.out.print(i+" ");
       }
   }
   
   System.out.print("\nPrint 1 to 20 divided by 5");
   for(int i = 1;i<=20;i++){
       if(i%5==0){
        System.out.print(i+" ");
       }
   }
   
   System.out.print("\nPrint 1 to 20 stope helf position:");
   int n = 20;
   for(int i = 1;i<=n ;i++){
       if(i==n/2){
        break;
       }
       System.out.print(i+" ");
   }
    }
}
