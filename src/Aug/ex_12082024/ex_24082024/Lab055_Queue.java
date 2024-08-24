package Aug.ex_12082024.ex_24082024;

import java.util.PriorityQueue;

public class Lab055_Queue {
    public static void main(String[] args) {
        PriorityQueue pq= new PriorityQueue();
        pq.add("20");
        pq.offer("50");//Offer is like add
        pq.offer("23");
        pq.offer("4");
        pq.offer("55");
        System.out.println(pq);
        System.out.println(pq.peek());// to view the first value
        System.out.println(pq.poll());// to remove the first value we using poll
        System.out.println(pq);
    }
}
