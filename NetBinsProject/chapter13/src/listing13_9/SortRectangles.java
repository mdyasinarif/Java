
package listing13_9;

import java.util.Arrays;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRactangle[] re = {
            new ComparableRactangle(83.4, 85.4),
            new ComparableRactangle(13.4, 15.4),
            new ComparableRactangle(23.4, 25.4),
            new ComparableRactangle(53.4, 55.4),
            new ComparableRactangle(33.4, 35.4),
            new ComparableRactangle(3.4, 5.4)
        };
        Arrays.sort(re);
        for (ComparableRactangle cop : re) {
            System.out.println(cop+" ");
            System.out.println();
        }
    }
}
