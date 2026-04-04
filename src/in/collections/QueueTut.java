package in.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTut {
    public static void main(String[] args) {
//        FIFO
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());

//        System.out.println(pq);


        Queue <Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll.size());
        System.out.println(ll.peek());;

        while (!ll.isEmpty()) {
            System.out.println("Removed");
            ll.remove();
        }

        Queue <Integer> l = new LinkedList<>();
        l.add(1);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(4);

        Utility.print(l);





    }
}
