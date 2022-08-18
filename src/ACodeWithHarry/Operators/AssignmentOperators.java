package ACodeWithHarry.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        //assignment operators are =, +=, -=, *=; /=; %=

        System.out.println("Assignment operators are used to assign a value");
        System.out.println("For exaxample:-");
        int a=9;
        System.out.println("a="+a);
        a+=3;//value 3 gets added in a
        System.out.println(a);
        a-=3;//value 3 gets subtracted from the previous value i.e. 12
        System.out.println(a);
        a*=3;//value 3 gets multiplied in the previous value i.e.9
        System.out.println(a);
        a%=3;//previous value i.e. 27 gets divided by 3 and the remainder is the answer
        System.out.println(a);
        a+=19;//19 gets added to previous value i.e. 0
        System.out.println(a);
        a/=3;//previos value i.e.19 gets divided by 3
        System.out.println(a);
    }
}
