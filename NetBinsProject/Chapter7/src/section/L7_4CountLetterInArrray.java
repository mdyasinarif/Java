
package section;


public class L7_4CountLetterInArrray {
    public static void main(String[] args) {
        char [] chars = createArray();
        System.out.println("The lowercase letter are");
        displayArray(chars);
        int[] counts = countLetter(chars);
        System.out.println();
        System.out.println("the occurrences of each letter are :");
        displayCount(counts);
    }
    public static char[] createArray(){
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomeLowreCaseLetter();
            return chars;
        }
    }
    public static void displayArray(char[] chars){
        for (int i = 0; i < chars.length; i++) {
            if((i+1)%20 == 0)
                System.out.println(chars[i]);
            else
                System.out.println(chars[i]+" ");
        }
    }
    public static int[] countLetter(char [] chars){
        int [] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i]- 'a']++;
            
        }
        return counts;
    }
    public static void displayCount(int[] couts){
        for (int i = 0; i < counts.length; i++) {
            if((i+1)%10==0)
                System.out.println(counts[i]+" "+(char)(i+'a'));
            else
                System.out.println(counts[i]+" "+(char)(i+'a')+" ");
        }
    
    }
}
