
package IO;

import java.io.File;
import java.io.IOException;


public class RenameFile {
    public static void main(String[] args) throws IOException{
        File oldFile = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\arif.txt");
        File newFile = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\sohan.txt");
        
        if (oldFile.renameTo(newFile)) {
            System.out.println("File is rename");
        } else {
            System.out.println("File is not exitct");
        }
    }
}
