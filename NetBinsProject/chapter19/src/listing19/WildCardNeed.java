
package listing19;


public class WildCardNeed {
    public static void main(String[] args) {
        GenericStack<Integer> inStack = new GenericStack<>();
        inStack.push(1);
        inStack.push(2);
        inStack.push(-2);
        
       //error System.out.println("Tha Max is "+max(inStack));
    }
    public static double max(GenericStack<Number> stack){
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {            
            double value = stack.pop().doubleValue();
            if (value > max) {
                
            }
        }
        return max;
    }
}
