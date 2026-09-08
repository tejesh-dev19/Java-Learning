package collectionFramework;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(66);
        al.add(0,58);
        al.add(99);

        for (int i = 0; i < al.size(); i++) {
            Object o = al.get(i);
            System.out.println(o);
        }

        //for backward fetch the elements
        ListIterator<Integer> itr = al.listIterator(al.size());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        System.out.println("*****************");
        //for forward fetching
        ListIterator<Integer> itr1 = al.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


      //  System.out.println(al.get(0));
        System.out.println("********************");

        //normal iterator fetching
        Iterator<Integer> itr2 = al.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


        // Collections.sort(al);

        // System.out.println(al);
    }
    
}
