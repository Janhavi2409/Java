package Test;

import java.util.Scanner;

class Transaction {
    private String transactionType;
    private int accountNumber;
    private int amount = 10000000;
    private int customerId;

    public Transaction(String transactionType, int accountNumber, int amount, int customerId) {
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.customerId = customerId;
    }

    public void getBalance() {
        System.out.println("Current Balance = " + amount);
    }

    public void creditAmount(int credit) {
        amount = amount + credit;
        System.out.println("Amount after Credit = " + amount);
    }

    public void debitAmount(int debit) throws InsufficientBalance {
        if (debit > amount) {
            throw new InsufficientBalance("ERROR: Insufficient Balance...");
        } else {
            amount = amount - debit;
            System.out.println("Amount After Debit = " + amount);
        }
    }

    public String details() {
        return "Transaction Type: " + transactionType +
                "\nAccount Number: " + accountNumber +
                "\nCustomer Id: " + customerId;
    }
}

public class Q4 {
    public static void main(String[] args) throws InsufficientBalance {

        Transaction transaction = new Transaction("Credit", 1234567890, 10000000, 2409);
        System.out.println(transaction.details());
        System.out.println("***********************Bank Transaction**************************");
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("1. Credit Amount");
            System.out.println("2. Debit Amount");
            System.out.println("3. Get Balance");
            System.out.println("Enter Your Choice: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter Amount to be credited: ");
                    transaction.creditAmount(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Amount to be debited: ");
                    transaction.debitAmount(sc.nextInt());
                    break;
                case 3:
                    transaction.getBalance();

                default:
                    System.out.println("Wrong Choice");
            }
            System.out.println("Do you want to continue?(y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}