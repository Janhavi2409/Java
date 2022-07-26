package ExceptionHandling;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Hello");

        //1] Exception=> Arithmetic Exception(Runtime)
        //   System.out.println(10/0);


        // 2] Exception=> IndexOutOfBondException (Runtime)
        //    int a[] = {1, 2, 3, 4};
        //    System.out.println(a[4]);

        //3] Exception=> NullPointerException (Runtime)
        //   String Name = null;
        //   System.out.println(Name.toLowerCase());

        //4] Exception=> NumberFormatException (Runtime)
        //   String n = "101A";
        //   int i = Integer.parseInt(n);
        //   System.out.println(n+5);
    }
}
