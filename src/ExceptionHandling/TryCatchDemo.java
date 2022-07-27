package ExceptionHandling;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int a;
        int b;
        int result=0;
        String str = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();


        try {
            result = a / b;
            System.out.println(str.toLowerCase());
        }

//        ->Generic catch
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }


        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("str is null");
            str = "CODEKUL";
            System.out.println(str.toLowerCase());
        }
        System.out.println("Result: " + result);
        System.out.println("Rest of the code");
    }
}