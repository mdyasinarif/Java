
package fileEx;

import java.io.File;
import java.io.IOException;

public class TestFile2 {
    public static void main(String[] args) throws IOException{
        File firstFile = new File("my_first_file.txt");
        File SecondFile = new File("my_Second_file.txt");
        
        boolean fileCreated = firstFile.createNewFile();
        
        if (fileCreated || firstFile.exists()) {
            printFileDetails(firstFile);
            printFileDetails(SecondFile);
            boolean renameFlag = firstFile.renameTo(SecondFile);
            if(!renameFlag){
                System.out.println("Could not rename"+firstFile);
            }
            printFileDetails(firstFile);
            printFileDetails(SecondFile);
        }
    }
    public static void printFileDetails(File f){
        System.out.println("Absulate path :"+f.getAbsolutePath());
        System.out.println("File Exists :"+f.exists());
    }
}
