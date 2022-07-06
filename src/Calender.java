import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first three letters of any Month");
        String cal = sc.next();
        switch (cal) {
            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("February");
                break;
            case "Mar":
                System.out.println("March");
                break;
            case "Apr":
                System.out.println("April");
                break;
            case "May":
                System.out.println("May");
                break;
            case "Jun":
                System.out.println("June");
                break;
            case "Jul":
                System.out.println("July");
                break;
            case "Aug":
                System.out.println("August");
                break;
            case "Sep":
                System.out.println("September");
                break;
            case "Oct":
                System.out.println("October");
                break;
            case "Nov":
                System.out.println("November");
                break;
            case "Dec":
                System.out.println("December");
                break;
            default:
                System.out.println("Error");
        }
    }
}


//string => ""
//char => ''