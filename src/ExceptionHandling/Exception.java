package ExceptionHandling;

public class Exception extends Throwable {
    public Exception(String s) {
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        //1] Exception=> Arithmetic Exception(Runtime)
//           System.out.println(10/0);


        // 2] Exception=> IndexOutOfBondException (Runtime)
            int a[] = {1, 2, 3, 4};
            //try catch exception handling
        System.out.println(a[0]+ " ");
        System.out.println(a[2]+ " ");
//        System.out.println(a[4]+ " ");
        System.out.println(a[3]+ " ");
        try {
                System.out.println(a[4]);
            }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }


        //3] Exception=> NullPointerException (Runtime)
        //   String Name = null;
        //   System.out.println(Name.toLowerCase());

        //4] Exception=> NumberFormatException (Runtime)

        //try catch exception handling
           String n = "101A";
           int i = Integer.parseInt(n);
           try {
               System.out.println(n + 5);
           }catch (NumberFormatException c){
               c.getMessage();
           }


        System.out.println("Hiiii");
    }
}
