package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Old ID: ");
        String ID = sc.next();

        System.out.print("Enter Student's First Name: ");
        String fName = sc.next();

        System.out.print("Enter Student's Middle Name: ");
        String mName = sc.next();

        System.out.print("Enter Student's Last Name: ");
        String lName = sc.next();

        String fullName = fName+" "+mName+" "+lName;

        System.out.print("Enter Student's Contact Number: ");
        String contactNo = sc.next();

        System.out.println("Do You want to change your ID?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        String nId = null;
        int choice = sc.nextInt();
        switch (choice){
            
            case 1:

                System.out.print("Enter new ID: ");
                nId = sc.next();
                break;

            case 2:
                System.out.println("Your ID is: "+ID);
                break;

            default:
                System.out.println("Either Select 1 or 2");
        }


        if(choice==1){
            students.add(nId);
            students.add(fullName);
            students.add(contactNo);
            System.out.println(students);
        }else {
            students.add(ID);
            students.add(fullName);
            students.add(contactNo);
            System.out.println(students);
        }

    }


}
