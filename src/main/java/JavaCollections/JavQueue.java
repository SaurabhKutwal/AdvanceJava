package JavaCollections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);
        System.out.println(queue.remove(10));
        System.out.println(queue.poll());


        PriorityQueue<Integer> queue2 = new PriorityQueue<>((x,y) -> y-x);

        queue2.add(1);
        queue2.add(2);
        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);


        System.out.println(queue2);
        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}
