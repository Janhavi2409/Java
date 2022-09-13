package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Amit");
        map.put(2,"Soniya");
        map.put(3,"David");
        map.put(4,"Sumant");
        map.put(5,"Prashant");
        System.out.println(map);
        map.put(null,null);//will be printed at last
        map.put(3,null);//will replace (3,"David")
        map.put(null,"Vaibhav");//will replace (null, null)
        System.out.println(map);
    }
}
