/**
 * 3 Types of variables
 * 1. local - scope of local variables function only
 * 2. instance-within a class but outside a method
 * 3. static-within a class but outside a method
 */

public class Variables {
    int c = 9;//instance variable
    static int b = 10;//static variable
    public static void main(String[] args) {
        int a = 20;//local variables
        System.out.println(b);
        System.out.println(a);
    }
    void display(){
        int a = 10;//local variables
        System.out.println(a+b+c);

    }

}
