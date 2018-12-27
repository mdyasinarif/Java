package com.coderbd.datatype;

public class DataTypeVariableEx {

    static byte byteVar = 123; //8bit(-128 to 127)
    static short shortVar = 32767;//16bit (-32768 to 32767)
    static int intVar = 2147483647;//32 bit
    static long longVar = 2147483648L;//64 bit
    static float floatVar = 2147483647.0F;// 64 bit
    static double dounleVar = 2147483648.0;//64 bit
    static char charVar = 'A';
    static boolean booleanVar = true;//08
    static String name;

    public static void main(String[] args) {

        System.out.println("byteVar :" + byteVar);

        System.out.println("shortVar :" + shortVar);
        System.out.println("intVar :" + intVar);
        System.out.println("longVar :" + longVar);
        System.out.println("floatVar :" + floatVar);
        System.out.println("charVar :" + charVar);
        System.out.println("booleanVar :" + booleanVar);
        // Reference Data Type
        System.out.println("Name :" + name);
        
        int num = 50;
        num++;
        num--;
        num+= 10;
        num-= 10;
        System.out.println("Result :"+num);
           

    }

}
