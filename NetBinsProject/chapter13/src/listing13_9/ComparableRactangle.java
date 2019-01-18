
package listing13_9;

import listing13_1.Rectangle;


public class ComparableRactangle extends Rectangle implements Comparable<ComparableRactangle>{

    public ComparableRactangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRactangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if(getArea() < o.getArea()){
            return -1;
        }else{
            return 0;
        }
        
    }

    @Override
    public String toString() {
        return super.toString()+" Area: "+getArea();
    }
  
}
