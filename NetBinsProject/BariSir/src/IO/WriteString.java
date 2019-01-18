
package IO;

import java.io.*;


public class WriteString {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\yasin.txt", true)))
        
        {
        String contain = "This i the content to write into file";
        String contain2 = "This i the content2 to write into file";

        bw.newLine();
        bw.write(contain);
        bw.newLine();
        bw.write(contain2);
        }
    }
}
