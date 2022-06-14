import java.util.Scanner;

public class TableEx {
    public static void main(String []args){
        int no = Integer.parseInt(args[0]);
        for (int i=1; i<=10;i++){
            System.out.println(no * i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int na = sc.nextInt();
        for (int i=1; i<=10;i++){
            System.out.println(na * i);
        }
    }
}
