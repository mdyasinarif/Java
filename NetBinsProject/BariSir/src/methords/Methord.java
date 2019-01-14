
package methords;


public class Methord {
    int x,y;
    
    //mutator method : paratameter valu change hoba
    void setXY(int x, int y){
    this.x = x;
    this.y = y;
    }
    
    //Non mutator method : paratameter valu change hoba na
    int sum(int x ,int y){
        return x+y;
    }
    
    public static void main(String[] args) {
        Methord obj = new Methord();
        obj.setXY(20, 30);
        int m = obj.sum(5, 10);
        System.out.println(obj.sum(5, 10));
    }
}
