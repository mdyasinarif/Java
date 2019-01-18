
package thisKey;


public class ThisRefEx {
    int x ;
    String y;

    public ThisRefEx(int x, String y) {
        this.x = x;
        this.y = y;
    }
    void sum(int x,int y){
        System.out.println(x+y);
    }
    void doYYY(String[] args){
        RecRef recerf = new RecRef();
        recerf.doxx(this);
        recerf.doMM(x);
    }
}
class RecRef{
    void doxx(ThisRefEx rr){
        rr.sum(10, 15);
    }
    void doMM(int s){
    
    }
    
    
}
