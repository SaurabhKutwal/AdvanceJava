package JavaCollections;


import java.util.Stack;

public class JavaStack {
    public static void main(String[] args){

        //Initialization of stack
        Stack<Integer> stack = new Stack<>();

        //adding element to top the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        //Removing element from top
        System.out.println("Removed ele is :  " + stack.pop());
        System.out.println("Removed ele is :  " + stack.pop());
        System.out.println(stack);

        System.out.println("Topmost ele is : " + stack.peek()); // topmost element

        System.out.println("Size of stack : " + stack.size()); // size of stack

        System.out.println("Is stack empty : " + stack.isEmpty()); // is stack empty

        stack.add(121);
        stack.add(122);
        stack.add(151);
        System.out.println(stack);


        System.out.println("position of ele 3 is : " + stack.search(3)); // Position from top os the stack
    }
}
