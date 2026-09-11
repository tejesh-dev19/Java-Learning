package collectionFramework;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"hello");
        hm.put(2,"java");
        hm.put(3,"micro");
        hm.put(4,"junit");
        hm.put(5,"spring");

        System.out.println(hm);

        String str=hm.get(2);
        System.out.println(str);

       Collection<String> values=hm.values();
       Iterator<String> itr =values.iterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }
        System.out.println("**********************");
      Set<Integer> keys =hm.keySet();
      Iterator itr1=keys.iterator();
      while (itr1.hasNext()){
          System.out.println(itr1.next());
      }
        System.out.println("************************");
        Set entry=hm.entrySet();
        Iterator itr3=entry.iterator();
        while (itr3.hasNext()){
          Map.Entry pairs = (Map.Entry) itr3.next();
            System.out.println("keys: "+pairs.getKey()+" value "+ pairs.getValue());
        }
//        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
//        hm.put(1,"hello");
//        hm.put(2,"java");
//        hm.put(3,"micro");
//        hm.put(4,"junit");
//        hm.put(5,"spring");
//
//
//        System.out.println(hm);

//        Hashtable ht = new Hashtable();
//        ht.put(10,"hello");
//        ht.put(20,"hello deo");
//        System.out.println(ht);

//        TreeMap tm = new TreeMap();
//        tm.put(10,"hello");
//        tm.put(20,null);
//        System.out.println(tm);

    }
}
