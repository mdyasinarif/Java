
import java.util.Scanner;

public class P82SwechCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks :");
        int i = input.nextInt();
        switch ((i / 10) * 10) {
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                 break;
            case 70:
                System.out.println("C");
                 break;
            case 60:
                System.out.println("D");
                 break;
            default:
                System.out.println("F");

        }
    }

}
