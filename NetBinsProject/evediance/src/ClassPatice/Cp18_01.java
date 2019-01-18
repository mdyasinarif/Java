/*
 * write a progran thgat takes some input 's 
using Scanner and from those Input make sun if 
values are divisir by 2 and substract 10 times 
if how many inputs you took from
 */
package ClassPatice;

import java.util.Scanner;

public class Cp18_01 {

    public static void main(String[] args) {
        makeSum();
    }

    static void makeSum() {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int num = 0;
        int sum = 0;
        int sub = 0;

        while (x % 2 == 0) {
            System.out.print("Enter Number:");
            x = input.nextInt();
            ++num;
            if (x % 2 == 0) {
                sum += x;
            }
            
        }
        sub = sum -((num -1)*10);
        System.out.println("Sum " + sum);
        System.out.println("sub " + sub);
    }
}
