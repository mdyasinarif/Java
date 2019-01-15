
package pionter;


public class Example {
    int data = 50;
   // primative type pass by value
    
    void change (int data){
        data = data + 100;//change will be in the local variable
        System.out.println("Data in Method :"+data);
    }
    
    
    public static void main(String[] args) {
        Example ex = new Example();
        System.out.println("Befor change :"+ex.data);
        ex.change(55);
        System.out.println("After change :"+ex.data);
        
        // objects are pass by referance
        ex.changBYoBj(ex);
        System.out.println("After change pass by referance:"+ex.data);
        
    }
    // objects are pass by referance
    void changBYoBj(Example e){
        e.data = 200;
    }
}
