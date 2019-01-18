/*
 * String is used to manipulate character strings that
    cannot be changed (read only and immmutable)
 * StringBuffer is used to represent characters that can be modified 
 * performance wise , stringbuffer is faster when performing concatenation.
 * this is because when you concatenate a string, you are creating a new object(internally)
 * evry time since string is immuatanle.
 */
package string_vs_stringbuffer;

public class Concat {
    public  static String concatWithString(){
        String t = "Cat";
        for (int i = 0; i <= 10000; i++) {
            t = t.concat("Dog");
        }
        return t;
    }
    public  static  String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Cat");
        for (int i = 0; i <= 10000; i++) {
            sb.append("Dog");
        }
        return sb.toString();
    }
    public static  String concatWithStringBuilder(){
        StringBuilder sbb = new StringBuilder("Cat");
        for (int i = 0; i <= 10000; i++) {
            sbb.append("Dog");
        }
        return sbb.toString();
    }
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("Concat with String took :"+(System.currentTimeMillis() - start)+" ms");
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concat with Stringbuffer :"+(System.currentTimeMillis()-start)+" ms");
        start = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Concat with StringBuilder:"+(System.currentTimeMillis()-start)+" ms");
    }
}

