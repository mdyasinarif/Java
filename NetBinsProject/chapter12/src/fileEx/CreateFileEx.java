
package fileEx;

import java.io.File;
import java.io.IOException;


public class CreateFileEx {
    public static void main(String[] args) throws IOException {
        File newFile = new File("Yasin.txt");
        File newFile2 = new File("Arif.txt");
         newFile.createNewFile();
         newFile.renameTo(newFile2);
    }    
}
