
package IO;

import java.io.File;
import java.io.IOException;


public class CreateRenameDelete {
    public static void main(String[] args) throws IOException{
        // file create
        File fileCreate = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\arif.txt");
        if (fileCreate.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File is Exict");
        }
        
        
        // rename
        
        File oldFile = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\arif.txt");
        File newFile = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\sohan.txt");
        
        if (oldFile.renameTo(newFile)) {
            System.out.println("File is rename");
        } else {
            System.out.println("File is not exitct");
        }
        
        // delete file
        File fileDelete = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\sohan.txt");
        
        if (fileDelete.delete()) {
            System.out.println(fileDelete.getName()+" is delete");
        } else {
            System.out.println("Delet operation is fail");
        }
    }
}
