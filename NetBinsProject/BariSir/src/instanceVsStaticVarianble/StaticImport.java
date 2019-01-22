
package instanceVsStaticVarianble;

import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import java.util.Date;


public class StaticImport {
    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(sqrt(5));
        System.out.println(parseInt("30"));
        Date dt = new Date();
        System.out.println(dt);
    }
}
