package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(2, "Sneha");
        map.put(3, "Nayana");
        map.put(4, "Suraj");
        System.out.println(map);
        map.put(3, "Anuja");
        System.out.println(map);
        map.put(null,null);
        System.out.println(map);
        map.put(null, "Sony");
        System.out.println(map);
        map.put(5, null);
        System.out.println(map);
        map.put(6, "Amit");
        System.out.println(map);
        System.out.println(map.get(5));
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        map.remove(5);
        System.out.println(map);

        //there are 16-1 nodes which are present in a bucket
        //in a node, there is hashcode, key, value, address of next node
        //if key is equal, then the value gets replaced in the node

    }
}
