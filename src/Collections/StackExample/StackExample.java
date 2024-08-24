package Collections.StackExample;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // The Stack class is a LIFO (Last In First Out) data structure
        // It extends class Vector with five operations that allow you to vector to be treated as a stack
        // The usual push and pop operations are provided

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
