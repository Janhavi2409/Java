package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> country = new HashSet<>();//set is unordered collection
        Set<String> states = new HashSet<>();
        country.add("India");
        country.add("Australia");
        country.add("Nepal");
        country.add("China");
        country.add("India");//doesn't print duplicate element...considers only one India
        country.add(null);
        country.add(null);//will not print null 2 times
        System.out.println(country);


        states.add("Maharashtra");
        states.add("A.P");
        states.add("Kerala");
        states.add("India");
        country.addAll(states);//union
        System.out.println(country);

        //country.retainAll(states);//intersection
        //System.out.println(country);


        country.containsAll(states);
        System.out.println(country);

    }
}
