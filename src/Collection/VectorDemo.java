package Collection;

//import java.util.List;
import java.util.Vector;

/*
Methods from vector class are synchronised
 */

public class VectorDemo {
    public static void main(String[] args) {
        //List<Integer> list = new Vector<>();
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(5);
        vector.add(3);
        vector.add(6);
        vector.add(20);
        System.out.println(vector);

    }
}
