/*
* combination that can be used
* 1. public static void main(String[] args)
* 2. public static void main(String [] array)
* 3. public static void main(String...arg)
* (Note: (String...arg) is known as vararg)
 */

public class Operators {
    public static void main(String args[]){
        int a = 30;
        boolean flag = false;
        System.out.println(a++);//30
        System.out.println(--a);//30
        System.out.println(++a);//31
        System.out.println(a--);//31

        System.out.println(~a);//-31

        System.out.println(!flag);//true

        int x = 10;
        int y = 20;
        int z = 30;
        //arithmetic operators
        System.out.println(x+y);//30
        System.out.println(z-y);//10
        System.out.println(x*y);//200
        System.out.println(y/x);//2
        System.out.println(z%y);//10
        //shift operators
        System.out.println(x<<3);//10*2^3=10*8=80
        System.out.println(y>>2);//20/2^2=20/4=5
        //logical operators (and)
        System.out.println(x>y&&y>z);//false
        System.out.println(x<y&&y<z);//true
        System.out.println(x>y&&y<z);//false
        System.out.println(x<y&&y>z);//false
        //logical operators (or)
        System.out.println(x>y||y>z);//false
        System.out.println(x<y||y<z);//true
        System.out.println(x>y||y<z);//true
        System.out.println(x<y||y>z);//true
        //bitwise operators (and)
        System.out.println(x>y&y>z);//false
        System.out.println(x<y&y<z);//true
        System.out.println(x>y&y<z);//false
        System.out.println(x<y&y>z);//false
        //bitwise operator (or)
        System.out.println(x>y|y>z);//false
        System.out.println(x<y|y<z);//true
        System.out.println(x>y|y<z);//true
        System.out.println(x<y|y>z);//true
        //Ternary operators
        System.out.println(x>y ? "x is max":"y is max");//y is max
    }
}