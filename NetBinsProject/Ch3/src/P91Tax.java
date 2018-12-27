
import java.util.Scanner;


public class P91Tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("0-Single,1-married filling jointly,2-married filling Separately,3-Head of House ");
        
        int status = input.nextInt();
        
        System.out.println("Enter the Taxable Income");
        double income = input.nextDouble();
        
        double tax = 0;
        
        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.01;
            }else if (income <= 33950) {
                tax = 8350 * 0.10 +(income-8350)*0.15;
            }else if (income <= 82250) {
                tax = 8350 * 0.10 +(33950-8350)*0.15+(income-82250)*0.25;
            }else if (income <= 171550) {
                tax = 8350 * 0.10 +(33950-8350)*0.15+(82250-33950)-0.25+(income-82250)*0.28;
            }else if (income <= 372950) {
                tax = 8350 * 0.10 +(33950-8350)*0.15+(82250-33950)-0.25+(171550-82250)*0.28+(income-171550)*.33;
            }else  {
                tax = 8350 * 0.10 +(33950-8350)*0.15+(82250-33950)-0.25+(171550-82250)*0.28+(372950-171550)*.33+(income-372950)*.035;
                    
            }
        }
            else if(status == 1){
               if (income <= 16700) {
                tax = income * 0.01;
            }else if (income <= 67900) {
                tax = 16700 * 0.10 +(income-67900)*0.15;
            }else if (income <= 137050) {
                tax = 16700 * 0.10 +(67900-8350)*0.15+(income-137050)*0.25;
            }else if (income <= 208850) {
                tax = 16700 * 0.10 +(67900-8350)*0.15+(82250-33950)-0.25+(income-82250)*0.28;
            }else if (income <= 372950) {
                tax = 8350 * 0.10 +(33950-8350)*0.15+(82250-33950)-0.25+(171550-82250)*0.28+(income-171550)*.33;
            }else  {
                tax = 8350 * 0.10 +(33950-8350)*0.15+(82250-33950)-0.25+(171550-82250)*0.28+(372950-171550)*.33+(income-372950)*.035;
                    
            }
                    }
            
        } else {
            System.out.println("Error : invalid status");
            System.exit(1);
        }
        System.out.println("Tax is" + (int)(tax * 100)/100.00);
    }
            
    
}
