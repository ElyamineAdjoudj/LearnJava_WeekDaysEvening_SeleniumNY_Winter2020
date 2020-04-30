package datastructurealgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

// Queue: FIFO order(First in first out)

    public static void main(String[] args) {

        Queue<String> name=new LinkedList<>();
        name.add("Denys");// Head
        name.add("Karim");
        name.add("Hakim");
        name.add("Lamara");
        name.add("Salah");
        name.add("Davis");// tail
        name.add("Jack");

        for (String st:name) {
            System.out.println(st);
        }

        System.out.println(" After Remove");

        name.remove("Hakim");

        for (String st:name) {
            System.out.println(st);
        }


        System.out.println("***********************");
        System.out.println( name.element());
        System.out.println("***********************");
        System.out.println( name.poll());
        System.out.println( name.poll());
        System.out.println("***********************");
        System.out.println(name.remove());
        // peek and remove
        System.out.println( name.poll());
        // return
        System.out.println(name.peek());

        System.out.println("***********************");
        //System.out.println( name.element());
        System.out.println( name.poll());

















    }










}
