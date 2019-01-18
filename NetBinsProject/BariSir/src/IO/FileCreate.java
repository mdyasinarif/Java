
package IO;

import java.io.File;
import java.io.IOException;


public class FileCreate {
    public static void main(String[] args) throws IOException{
        File file = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\arif.txt");
        if (file.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File is Exict");
        }
        
    }
}
