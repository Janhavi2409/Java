package ACodeWithHarry.Operators;

public class LogicalOperators {
    public static void main(String[] args) {

        //logical operators are &&, ||, !
        //!= means not equal to

        System.out.println("18>9 && 9>18: "+(18>9 && 9>18));
        System.out.println("18>9 && 18>17: "+(18>9 && 18>17));
        System.out.println("18>21 && 18<9: "+(18>21 && 18<9));
        System.out.println("18<17 && 18>9: "+(18<17 && 18>9));
        //T&&T=>T

        System.out.println("18>9 || 9>18: "+(18>9 || 9>18));
        System.out.println("18>9 || 18>17: "+(18>9 || 18>17));
        System.out.println("18>21 || 18<9: "+(18>21 || 18<9));
        System.out.println("18<17 || 18>9: "+(18<17 || 18>9));

        System.out.println("18>9 || 9>18: "+(18>9 || 9>18));
        System.out.println("18>9 || 18>17: "+(18>9 || 18>17));
        System.out.println("18>21 || 18<9: "+(18>21 || 18<9));
        System.out.println("18<17 || 18>9: "+(18<17 || 18>9));
    }
}
