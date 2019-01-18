
package castEx;


public class PrimitiveTypeEx {
    public static void main(String[] args) {
        //Strint to int
        String s = "14";
        int sToi = Integer.parseInt(s);
        //or we can writer
        //sToi = Integer.valueOf(s).intValue();
        System.out.println("Stirng to int :"+s);
        
        // int ot String
        int i = 14;
        String iTos = Integer.toString(i);
        System.out.println("Integer to String:"+ iTos);
        
        // String to Duble
        
        String sd = "14";
        double sTod = Double.parseDouble(sd);
        // or we can write
        //double  sTod = Double.valueOf(sd).doubleValue();
        System.out.println("String to Duble: "+sTod);
        
        // Double to String
        double dd = 14.50;
        String dTos = Double.toString(dd);
        System.out.println("Double to Sring: "+dd);
        
        
    }
}
