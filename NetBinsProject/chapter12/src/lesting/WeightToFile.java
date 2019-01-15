
package lesting;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WeightToFile {
    public static void main(String[] args) {
        String testFile = "yasin.html";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(testFile))) {
            bw.append("yasin");//add text append == add
            bw.newLine();
            bw.append("is");//add text append == add
            bw.newLine();
            bw.append("The");//add text append == add
            bw.newLine();
            bw.append("Capital");//add text append == add
            bw.flush();//
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("Writing Done ");
        }
    }
}
