package Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(null);

        System.out.println(stack);

        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.search(10));
        System.out.println(stack.search(20));
        System.out.println(stack.search(30));
        System.out.println(stack.search(40));
        System.out.println(stack.search(50));



    }
}
