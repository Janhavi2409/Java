package ACodeWithHarry.Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //arithmetic operators +, -, /, *, %, ++a, a++, --a, a--

        int a = 10;
        int b = 21;
        char ch = 'A';
        System.out.println("Operands are a=10 and b=21");
        System.out.println("Operations are:-");
        System.out.println("Addition is: "+(a+b));//Addition
        System.out.println("Subtraction is: "+(b-a));//Subtraction
        System.out.println("Multiplication is: "+(a*b));//Multiplication
        System.out.println("Remainder is: "+(b%a));//Modulo-->it gives remainder
        System.out.println("Division is: "+(b/a));//Division
        System.out.println("Assign them Increment value: "+(a++));//assign then increment
        System.out.println("Increment then Assign value: "+(++a));//increment then assign
        System.out.println("Assign then Decrement value: "+(b--));//assign then decrement
        System.out.println("Decrement then Assign value: "+(--b));//decrement then assign
        System.out.println("++ch: "+ ++ch);
    }
}
