package Inheritance;

/*
 * Single Inheritance*/
public class BankSingleInheritance {
    int bankNo;
    String ifsCode;
}

class SbiBank extends BankSingleInheritance {
    String Address;
    String branchCode;
    String contactNo;

    void display() {
        System.out.println("Bank no.:- " + bankNo);
        System.out.println("IFSC:- " + ifsCode);
        System.out.println("Address:- " + Address);
        System.out.println("Branch Code:- " + branchCode);
        System.out.println("Contact No.:- " + contactNo);
    }
}

class BankImpl {
    public static void main(String[] args) {
        SbiBank sbiBank = new SbiBank();
        sbiBank.bankNo = 8555;
        sbiBank.ifsCode = "SBI000015397";
        sbiBank.Address = "Kothrud Pune";
        sbiBank.branchCode = "SBI10025";
        sbiBank.contactNo = "9837124875";
        sbiBank.display();
    }
}