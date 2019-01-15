package lesting;

import java.io.BufferedReader;
import java.lang.Exception;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) throws Exception {
        String srcFile = "yasin.html";
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        String text = null;
        String lines = "";

        while((text = br.readLine())!= null){
        System.out.println(text);
            lines += text + " ";
        }

        System.out.println("lines :" + lines);
        if (lines.contains("Dhakaa")) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }
    }
}
