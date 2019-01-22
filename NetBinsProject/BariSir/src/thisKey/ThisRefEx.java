
package thisKey;


public class ThisRefEx {
    int x ;
    String y;

    public ThisRefEx(int x, String y) {   
        //  resolve ambigity between insance variable and paramater
        this.x = x;
        this.y = y;
    }
    void sum(int x,int y){
        System.out.println(x+y);
    }
    void doYYY(String[] args){
        RecRef recerf = new RecRef();
        recerf.doxx(this);// current class object
        recerf.doMM(x);
    }
}
class RecRef{

   
    // class type paramater
    void doxx(ThisRefEx rr){
        rr.sum(10, 15);
    }
    void doMM(int s){
    
    }
    public static void main(String[] args) {
        System.out.println("sum ");
    }
    
    
}
