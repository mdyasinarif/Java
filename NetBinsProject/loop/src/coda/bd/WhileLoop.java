
package coda.bd;



public class WhileLoop {
    public static  void printFirstNumToSecondnum(int num1, int num2){
        while (num1<= num2) {            
            System.out.println(num1);
            num1++;
        }
    
    }
    public static int makeSumFirstNumToSecondnum(int num1, int num2){
        int sum = 0;
        while (num1<= num2) {            
            sum+=num1;
            num1++;
        }
        return sum;
    
    }
}
