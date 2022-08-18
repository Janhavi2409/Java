package ACodeWithHarry.Operators;

public class Precedence_And_Associativity {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        /*
        NOTE:- The Highest Precedence goes to * and /. They are then evaluated
               on the basis of left to right associativity.
        a=6*5-34/2
        a=30-34/2
        a=30-17
        a=13
         */
        System.out.println(a);

        int b = 60/5-34*2;
        /*
        b=60/5-34*2
        b=12-34*2
        b=12-68
        b=-56
         */
        System.out.println(b);
    }
}
