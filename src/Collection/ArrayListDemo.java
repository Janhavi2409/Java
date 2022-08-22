package Collection;
import StringDemo.Sorting;

import  java.util.List;


public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("Kolkata");
        list.add("Chennai");
        list.add("Madras");


        System.out.println(list);


        System.out.println(list.size());


        list.add(3,"Bangalore");
        System.out.println(list);


        if(!list.isEmpty()){
            System.out.println("List is not Empty");
        }


        System.out.println(list.get(2));

        System.out.println(list.contains("Madras1"));

        System.out.println(list.indexOf("Bangalore"));

        //list.containsAll();

        System.out.println(list.remove("Kolkata"));
        System.out.println(list.remove(4));
    }
}
