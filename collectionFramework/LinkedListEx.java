package collectionFramework;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.add(22);
        ll.add(66);
        ll.add(84);
        ll.addFirst(99);
        ll.addLast(5);

        System.out.println(ll);
    }
    
}
