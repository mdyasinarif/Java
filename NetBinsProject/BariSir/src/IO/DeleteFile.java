
package IO;

import java.io.File;
import java.io.IOException;


public class DeleteFile {
    public static void main(String[] args) throws IOException{
        File file = new File("F:\\IDB\\Git\\Java8\\NetBinsProject\\BariSir\\src\\IO\\sohan.txt");
        
        if (file.delete()) {
            System.out.println(file.getName()+" is delete");
        } else {
            System.out.println("Delet operation is fail");
        }
    }
}
