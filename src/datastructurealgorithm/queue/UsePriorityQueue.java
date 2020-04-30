package datastructurealgorithm.queue;

import java.util.PriorityQueue;

public class UsePriorityQueue {
    // top element from Priority Queue: peek method only peek value from Queue


    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(80);

        System.out.println(pq.peek());

        for (Integer num:pq) {
            System.out.println(num);
        }

        System.out.println(" Using Pool Method ");
        // Pool method peek and remove
        System.out.println(pq.poll());

        for (Integer num:pq) {
            System.out.println(num);
        }






    }
}
