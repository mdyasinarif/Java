package listing17_2;

import java.io.*;

public class TestDataStream {

    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.txt"));
                ) 
        {
            output.writeUTF("Yasin");
            output.writeDouble(85.5);
            output.writeUTF("Arif");
            output.writeDouble(80.6);
            output.writeUTF("Sohan");
            output.writeDouble(72.4);
        }
        try(DataInputStream input  = new DataInputStream(new FileInputStream("temp.txt"))){
            System.out.println(input.readUTF()+" "+input.readDouble());
            System.out.println(input.readUTF()+" "+input.readDouble());
            System.out.println(input.readUTF()+" "+input.readDouble());
            
        }
    }
}
