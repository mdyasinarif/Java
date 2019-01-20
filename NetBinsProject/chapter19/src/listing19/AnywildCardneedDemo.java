
import listing19.GenericStack;


public class AnywildCardneedDemo {
   public static void main(String[] args) {
        GenericStack<Integer> inStack = new GenericStack<>();
        inStack.push(1);
        inStack.push(2);
        inStack.push(-2);
        
        System.out.println("Tha Max is "+max(inStack));
    }
    public static double max(GenericStack<? extends Number> stack){//Integer thakay Number ka Extend kora hoy sa
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {            
            double value = stack.pop().doubleValue();
            if (value < max) {
                
            }
        }
        return max;
    }
}
