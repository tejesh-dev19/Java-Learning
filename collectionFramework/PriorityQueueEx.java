package collectionFramework;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(65);
        pq.add(5);
        pq.add(6);
        pq.add(88);

        System.out.println(pq);
    }
    
}
