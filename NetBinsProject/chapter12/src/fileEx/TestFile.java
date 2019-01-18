package fileEx;

import java.io.File;
import java.io.IOException;

public class TestFile {

    public static void main(String[] args) throws IOException {
        File newFile = new File("my_new_file.txt");
        printFileDeteails(newFile);
// create new file
        boolean fileCreated = newFile.createNewFile();
        if (!fileCreated) {
            System.out.println(newFile + " cound not be created.");
        }
        printFileDeteails(newFile);
// delet new file
        newFile.delete();
        System.out.println(newFile + " cound not be created.");
        printFileDeteails(newFile);
    
// recreate new file
        newFile.createNewFile();
        printFileDeteails(newFile);
        
    }

    public static void printFileDeteails(File f) {
        System.out.println("Abslulate Path :"+f.getAbsolutePath());
        System.out.println("File Exists :"+f.exists());
    }
}
