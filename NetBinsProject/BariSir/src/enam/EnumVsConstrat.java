/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enam;

 class DayConstrant {
    public static final int SAT = 1;
    public static final int SUN = 2;
    public static final int MON = 3;
    
}

enum DayEnum{
    SAT,SUN,MON
}
public class EnumVsConstrat {
    
    static void enumEx (DayEnum denum){
        if (denum == DayEnum.SAT ) {
            System.out.println("Enum- Saturday");
        } else if(denum == DayEnum.SUN){
            System.out.println("Enum- Sunday");
        }else if(denum == DayEnum.MON){
            System.out.println("Enum- Monday");
        }else{
            System.out.println("Enum- Invalid Day");
        }
    }
    /*We can change the int constants value in DayConstant class
    but program will not throw any exception
    although program might not work as expected
    */
    
    static void consEx(int i){
    if (i == DayConstrant.SAT ) {
            System.out.println("Constrant- Saturday");
        } else if(i == DayConstrant.SUN){
            System.out.println("Constrant- Sunday");
        }else if(i == DayConstrant.MON){
            System.out.println("Constrant- Monday");
        }else{
            System.out.println("Constrant- Invalid Day");
        }
    }
    public static void main(String[] args) {
        //Enum values are fixed so it privides type safety
        enumEx(DayEnum.SAT);
        enumEx(DayEnum.SUN);
        enumEx(DayEnum.MON);
        //enumEx(DayEnum.TUE);// not work
        
        consEx(1);
        consEx(2);
        consEx(3);
        consEx(4);// we can pass any int to constrant
    }
    
    }


