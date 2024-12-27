package JavaCollections;

import java.util.LinkedList;

public class JavaLinkedList {

    public static void main(String[] args){

        //Initialization of linked list.
        LinkedList<Integer> list = new LinkedList<>();

        //Adding elements in list
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(2,12);
        System.out.println(list);

        list.addFirst(10);
        list.addLast(100);
        System.out.println(list);

        //accessing elements
        System.out.println(list.get(3));
        System.out.println("First ele of list is : " + list.getFirst());
        System.out.println("Last ele of list is : " + list.getLast());

        //removing elements from list
        System.out.println("Removed ele is : " + list.remove());
        System.out.println("First ele removed : " + list.removeFirst());
        System.out.println("Last ele removed : " + list.removeLast());
        System.out.println(list);

        //Update element
        list.set(1,100);
        System.out.println(list);

        System.out.println("Size of list is : " + list.size());



        //We can achieve stack implementation using linked list.
        //LIFO -> last in first out
        LinkedList<Integer> stack = new LinkedList<>();

        //Adding element to last of stack.
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        stack.addLast(4);
        stack.addLast(5);

        System.out.println(stack);

        //removing elements from top
        System.out.println("Removed ele is : " + stack.removeLast());
        System.out.println("Removed ele is : " + stack.removeLast());
        System.out.println(stack);

        //Accessing top element
        System.out.println("topmost ele is : " + stack.getLast());

        System.out.println("Is stack is empty :" + stack.isEmpty());
        System.out.println("Size of stack is :" + stack.size());
        System.out.println(stack);


        //We can also achieve implementation of Queue
        //FIFO -> first in first out
        LinkedList<Integer> queue = new LinkedList<>();

        //adding elements in queue from back side only
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);

        System.out.println(queue);

        //removing element from front side
        System.out.println("removed ele is : " + queue.removeFirst());
        System.out.println("removed ele is : " + queue.removeFirst());
        System.out.println(queue);

        //Getting front element only
        System.out.println("Front element is : " + queue.getFirst());

        System.out.println("Is Queue is empty :" + queue.isEmpty());
        System.out.println("Size of queue is :" + queue.size());
        System.out.println(queue);

    }
}
