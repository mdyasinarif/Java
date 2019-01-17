package listing13_8;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObj {

    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tamp"};
        Arrays.sort(cities);

        for (String city : cities) {
            System.out.println(city + " ");
        }
        System.out.println();

        BigInteger[] hugNambers = {new BigInteger("23232310926239992"),
            new BigInteger("546544894654456465564"),
            new BigInteger("588554564564544564")};
        Arrays.sort(hugNambers);
        for (BigInteger hugNamber : hugNambers) {
            System.out.println(hugNamber+" ");
        }
        
    }
}
