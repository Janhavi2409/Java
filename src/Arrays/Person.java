package Arrays;

import java.util.Scanner;

public class Person {
    private int pId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String Address;

    public Person(int pId, String firstName, String lastName, String mobileNo, String address) {
        this.pId = pId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        Address = address;
    }


    public int getpId() {
        return pId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAddress() {
        return Address;
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = scanner.nextInt();
        Person person[]= new Person[size];
        System.out.println("Enter Person Details");
        for(int i=0;i<size;i++){
            System.out.println("Enter Id");
            int id = scanner.nextInt();
            System.out.println("Enter First Name");
            String firstName = scanner.next();
            System.out.println("Enter Last Name");
            String lastName = scanner.next();
            System.out.println("Enter Mobile No.");
            String mobileNo = scanner.next();
            System.out.println("Enter Address");
            String address = scanner.next();
            person[i] = new Person(id,firstName,lastName,mobileNo,address);
        }

        for (Person p:person){
            System.out.println("Id: "+p.getpId());
            System.out.println("First Name: "+p.getFirstName());
            System.out.println("Last Name: "+p.getLastName());
            System.out.println("Mobile No: "+p.getMobileNo());
            System.out.println("Address: "+p.getAddress());
        }
        }

    }


