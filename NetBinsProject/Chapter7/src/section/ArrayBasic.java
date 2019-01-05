package section;

public class ArrayBasic {

    public static void main(String[] args) {
        int[] intArr = new int[3]; // length
        intArr[0] = 10;
        intArr[1] = 50;
        intArr[2] = 50;
        System.out.println("intArr : " + intArr.length);
        System.out.println("intArr[0] : " + intArr[0]);
        System.out.println("intArr[1] : " + intArr[1]);
        System.out.println("intArr[2] : " + intArr[2]);

        String[] str = new String[3];
        str[0] = "AAA";
        System.out.println("Str[0] :" + str[0]);

        double[] doubleArr = new double[3];
        doubleArr[0] = 100.0;
        System.out.println("doubleArr[0]" + doubleArr[0]);

        int[] intArray = {5, 10, 15, 20, 25};
        System.out.println("Min:" + intArray[0]);
        System.out.println("Max:" + intArray[intArray.length - 1]);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index " + i + ":" + intArray[i]);
        }
        ////
        char[] city = {'D', 'a', 'l', 'a', 's'};

        for (char c : city) {
            System.out.println(c);
        }
        ///////
        int[] intNumber = new int[100];
        for (int j = 0; j < intNumber.length; j++) {
            intNumber[j] = j;
        }
        System.out.println("length :" + intNumber.length);

        for (int p = 0; p < intNumber.length; p += 5) {// 5 kora bar ba
            System.out.println(p + " : " + intNumber[p]);

        }
        /// for each loop
        for (int i : intNumber) {
            System.out.println(i);
        }
    }
}
