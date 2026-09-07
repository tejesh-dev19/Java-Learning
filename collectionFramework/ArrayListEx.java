package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(66);
        al.add(0,58);
        al.add(99);
        

        Collections.sort(al);

        System.out.println(al);
    }
    
}
