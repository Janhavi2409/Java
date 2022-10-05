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

    public void Amount() {
        System.out.println("Current Balance = " + amount);
    }

    public int creditAmount(int credit) {
        amount = amount + credit;
        System.out.println("Amount after Credit = " + amount);
        return amount;
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
        Transaction transaction = new Transaction("Savings", 1234567890, 10000000, 2409);
        System.out.println(transaction.details());
        transaction.Amount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int i = sc.nextInt();
        while (i < 2) {
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Credit Amount");
            System.out.println("2. Debit Amount");
            System.out.println("3. End Transaction");
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
                default:
                    System.out.println("Transaction Ended");
                    break;
            }
        }
    }
}