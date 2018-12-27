
package sections;

import java.util.Scanner;


public class S5_7FutureTution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;
        int tution = 1000;
        int totalTutionTenYears ;
        for (int year = 1; year < 14; year++) {
           tution+=tution*0.05;
            if (year > 10) {
                totalCost += tution;
                if (year == 10) 
                    totalTutionTenYears = tution;
                
            
        }
        System.out.println("total Tution Ten Years tution : $"+  totalTutionTenYears);
        System.out.println("Total tution : $"+totalCost);
    }

    }