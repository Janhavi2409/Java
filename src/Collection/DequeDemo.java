package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        //Deque<String> cities = new LinkedList<>();

        Deque<String> cities = new ArrayDeque<>();
        cities.addFirst("Pune");//addFirst returns void
        cities.addFirst("Mumbai");
        cities.offerFirst("Ooty");//offerFirst returns boolean value
        cities.offerLast("Nagpur");
        cities.addLast("Kolkata");
        System.out.println(cities);
        System.out.println(cities.peekFirst());
        System.out.println(cities.peekLast());
        System.out.println(cities.poll());
        System.out.println(cities);



    }
}
