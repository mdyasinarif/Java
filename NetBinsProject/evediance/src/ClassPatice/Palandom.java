package ClassPatice;

import java.util.Scanner;

public class Palandom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String :");
        String inputString = input.nextLine();

        int length, begin, end, midel;
        length = inputString.length();
        begin = 0;
        end = length - 1;
        midel = (begin + end) / 2;

        for (int i = begin; i <= midel; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
    }
    if (i == midel

    
        +1) {
            System.out.println("is palandom");
    }

    
        else {
             System.out.println("is  not palandom");
    }
}
}
