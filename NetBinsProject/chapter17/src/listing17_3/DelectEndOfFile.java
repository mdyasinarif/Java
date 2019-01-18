
package listing17_3;

import java.io.*;


public class DelectEndOfFile {
    public static void main(String[] args) {
        try {
            try(DataOutputStream output = new DataOutputStream(new FileOutputStream("yasin.txt"))){
                output.writeDouble(14.2);
                output.writeDouble(14.8);
                output.writeDouble(14.10);
             try(DataInputStream input = new DataInputStream(new FileInputStream("yasin.txt"))){
                 while (true) {                     
                     System.out.println(input.readDouble());
                 }
             }
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
