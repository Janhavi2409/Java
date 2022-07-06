package constrolflowstatemnet;

public class PrimeNo {
    public static void main(String[] args) {
        int i, m = 0, flag = 0;
        int no = 4;//it is the number to be checked
        m = no / 2;
        if (no == 0 || no == 1) {
            System.out.println(no + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (no % i == 0) {
                    System.out.println(no + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(no + " is prime number");
            }
        }//end of else
    }
}
