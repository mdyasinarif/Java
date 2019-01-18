
package listing17_8;

import java.io.*;



public class TextRandomAccess {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try(
                RandomAccessFile inout = new RandomAccessFile("inout.txt", "rw") ;   
                )
        {
            inout.setLength(0);
            for (int i = 0; i < 200; i++) {
               inout.writeInt(i);
               
            }
             System.out.println("Current file length:"+inout.length());
             
             inout.seek(0);
             System.out.println("The first number is "+inout.readInt());
             
             inout.seek(1 * 4);
             System.out.println("The Second number is "+inout.readInt());
             
             
        }
        
    }
}
