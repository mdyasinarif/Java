package listing19;

public class TestGeneric {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Dhaka");
        stack1.push("Savar");
        stack1.push("Raj");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(101);
        stack2.push(102);
        stack2.push(103);
        
        System.out.println(stack1);
        System.out.println(stack2);
        
        System.out.println("Size "+stack1.getSize());
        System.out.println("peek "+stack1.peek());
        System.out.println("Size "+stack1.getSize());
        System.out.println("pop "+stack1.pop());
         System.out.println("Size "+stack1.getSize());
    }
}
