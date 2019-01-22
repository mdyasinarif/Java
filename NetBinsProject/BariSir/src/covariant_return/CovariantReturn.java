
package covariant_return;
// different type of return
// only overriter methods super  class object return

class SuperA{
    int x = 1;
}
class SubB extends SuperA{
    int y = 2;
}
class Base{
    SuperA getObject(){
        System.out.println("Base");
        return new SuperA();
    }
}

public class CovariantReturn extends Base {
    @Override
    SuperA getObject(){
        System.out.println("CovariantReturn");
        return new SubB();// super class sub class return kor sa
    }
    public static void main(String[] args) {
        
        
        Base test = new CovariantReturn();
        //CovariantReturn test2 = new CovariantReturn();
        //Base test3 = new CovariantReturn();
        
        
       
        System.out.println(test.getObject() instanceof SubB);
        System.out.println(test.getObject().x);
//        System.out.println(test2.getObject() instanceof SubB);
//        System.out.println(test2.getObject().x);
//        System.out.println(test3.getObject() instanceof SubB);
//        System.out.println(test3.getObject().x);
    }
}
