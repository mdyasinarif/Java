
package listing17_4;

import java.io.*;



public class Copy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        if(args.length != 2){
//            System.out.println("Usage: java copy source File Targe file");
//            System.exit(1);
//        }
//        File SocreFile = new File(args[0]);
//        if (!SocreFile.exists()) {
//            System.out.println("Source File "+args[0]+" does not exit");
//            System.exit(2);
//        }
//        File targetFile = new File(args[1]);
//        if (!targetFile.exists()) {
//            System.out.println("Target file"+args[1]+" alrady exists");
//            System.exit(3);
//        }
        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream("yasin.txt"));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("arif.txt"));                
                )
        {
            int r , numberOfBytesCopied = 0;
            while ((r = input.read())!= -1) { 
                output.write((byte)r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied+"Bytes Copied");
        }
    }
}
