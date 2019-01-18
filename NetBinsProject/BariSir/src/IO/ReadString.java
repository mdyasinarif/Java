
package IO;

import java.io.*;



public class ReadString {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\yasin.txt")))
        {
        String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {                
                System.out.println(sCurrentLine);
            }
        }
    }
}
