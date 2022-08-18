package ACodeWithHarry.Operators;

public class ResultingDataTypes {
    public static void main(String[] args) {
        byte b = 34;
        float f = 13.62f;
        short s = 8;
        double d = 19.62;
        int i = 63;
        char ch = 'A';
        long l = 12345678910l;


        int R1 = b+s;//int = byte+short
        int R2 = s+i;//int = short+int
        int R3 = ch+i;//int = char+int
        int R4 = ch+s;//int = char+short
        float R5 = l+f;//float = long+float
        float R6 = i+f;//float = int+float
        double R7 = l+d;//double = long+double
        double R8 = f+d;//double = float+double

        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);
        System.out.println(R4);
        System.out.println(R5);
        System.out.println(R6);
        System.out.println(R7);
        System.out.println(R8);


    }
}
