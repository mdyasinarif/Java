
public class Ispallindom {
    public static boolean ispallindom(String s){
    boolean status = false;
    StringBuilder str = new StringBuilder(s);
    String newStr = String.valueOf(str.reverse());
        if (newStr.equalsIgnoreCase(s)) {
            status = true;
        }
        return status;
    
    }
    public static int countPalindone(String [] s){
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (ispallindom(s[i])) {
                counter++;
            }
        }
    return counter;
    }
}
