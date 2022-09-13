package Collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(105,"Maharashtra");
        map.put(103,"AP");
        map.put(104,"Goa");
        map.put(103,"Goa");
        map.put(106,null);
        //map.put(null, null);//throws NullPointerException
        //map.put(null,"Kerala");//throws NullPointerException
        System.out.println(map);
    }
}
