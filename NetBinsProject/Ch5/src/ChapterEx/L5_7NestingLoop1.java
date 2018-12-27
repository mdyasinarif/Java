package ChapterEx;

import java.util.Scanner;

public class L5_7NestingLoop1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("    Multiplication Table");
        System.out.print("    ");
        for (int j = 1; j <=10; j++) {
            System.out.print("   "+j);
        }
            System.out.println("\n---------------------------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i+" | ");
                    for (int k = 1; k <= 10; k++) {
                        System.out.printf("%4d",i*k);
                }
                    System.out.println();
            }
        }
    }

