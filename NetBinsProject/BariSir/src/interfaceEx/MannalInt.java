
package interfaceEx;

// interface  to interface  extends 
// Class  to interface  Implements
// mannalInt abstract hola no need to override
// but not create to object is conctit class
public class MannalInt implements Animal{// is a relation 
    MannalInt(){
        // x = 67;
       int x = 67;// not work 
    
    }
    public int noOfLegs(){
        return 10;
    }
    
    public static void main(String[] args) {
        MannalInt m = new MannalInt();
        m.eat();
        m.travel();
        
        System.out.println(m.noOfLegs());
        
        System.out.println(x);
        System.out.println(m.x);// from animal final ti no change x = 67
        System.out.println(Animal.x);
    }
    
    @Override
    public void eat() {
        System.out.println("Mammal Eate");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travel");
    }
    
}
