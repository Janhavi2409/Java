package Collection;

public class GenericsDemo<T> {
    T t;
    T getValue(T t){
        this.t = t;
        return t;
    }

    public static void main(String[] args) {
        GenericsDemo demo = new GenericsDemo();
        System.out.println(demo.getValue(5));
        System.out.println(demo.getValue("Hi"));
        System.out.println(demo.getValue(true));
    }
}
