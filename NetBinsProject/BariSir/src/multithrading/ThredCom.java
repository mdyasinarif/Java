
package multithrading;

import java.util.Scanner;


public class ThredCom {
    int amount = 10000;
    
    synchronized  void withdraw(int amount){
        System.out.println("withdraw...");
        if (this.amount < amount) {
            System.out.println("Less balance wating for Deposit...");
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        int currentDep = this.amount;
        System.out.println("Current Balance is "+currentDep);
        
        if (currentDep < 0 ) {
            System.out.println("Transclation cancle..");
            
        }else{  
             System.out.println("withdraw compleate...");
        }
        
    }
    synchronized void deposit(int amount){
        System.out.println("Deposit ..");
        this.amount += amount;
        System.out.println("Deposit completed ..");
        notify();
        //System.out.println("Current Balance is "+this.amount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        final ThredCom c = new ThredCom();
        System.out.print("Enter Your withdraw amount : ");
        new Thread(){ 
            int wid = sc.nextInt();
            public void run() {
               
               c.withdraw(wid);
            }
        }.start();  

            new Thread(){
            public void run() {
               System.out.print("Enter Your Deposit amount : ");
               int dep = sc.nextInt();
               c.deposit(dep);
            }
        }.start();
 
    }
}
