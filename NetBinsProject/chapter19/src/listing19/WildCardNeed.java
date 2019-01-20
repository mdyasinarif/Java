
package listing19;


public class WildCardNeed {
    public static void main(String[] args) {
        GenericStack<Integer> inStack = new GenericStack<>();
        inStack.push(1);
        inStack.push(2);
        inStack.push(-2);
        
        print(inStack);
    }
    public static void print(GenericStack< ? > stack){//Integer thakay Number ka Extend kora hoy sa
       
        while (!stack.isEmpty()) {            
            System.out.println(stack.pop()+" ");
    }
    }
}

