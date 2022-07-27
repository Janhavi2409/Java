package ExceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        String msg = "PUNE";
        try{
            System.out.println(msg.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In finally block");
        }
        System.out.println("Rest of the code");
    }
}
