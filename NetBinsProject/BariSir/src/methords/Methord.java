
package methords;


public class Methord {
    // field variable + global variable
    int x,y;
    double d;
    String s;
    
    static int dispSmu(){
        int a = 100;// local variable
        int b = 200;
        return a + b;
    }
    //mutator method : paratameter valu change hoba
    void setXY(int x, int y){// paramater varibale
    this.x = x;
    this.y = y;
    // return optional no work
    }
    
    // mathod name = sum
    // mathod signature =  sum(int x ,int y)
    // mathod interface = int sum(int x ,int y)/public int sum(int x ,int y)
    // mathod body = {} optional
    
    //Non mutator method : paratameter valu change hoba na
    int sum(int x ,int y){
        return x+y;
    }
    
    public static void main(String[] args) {
        
        System.out.println("dispSmu "+dispSmu());
        Methord obj = new Methord();
        
        obj.setXY(20, 30);
        System.out.println("sum "+obj.sum(5, 10));// with out object
        int m = obj.sum(5, 10);// creating object
        System.out.println("Sum creating object :"+m);
        
    }
}
