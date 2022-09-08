package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(87);
        numbers.add(84);
        numbers.add(52);
        numbers.add(100);
        numbers.add(5);
        numbers.add(25);
        numbers.add(46);
        //numbers.add(null);//will not add null element...throws NullPointerException
        System.out.println(numbers);
        System.out.println(numbers.ceiling(97));//ceiling means the given no. gets compared with the highest no. near the given no. in the set
        System.out.println(numbers.floor(97));//floor means the given no. gets compared with the lowest no. near the given no. in the set
    }
}
