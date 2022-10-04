package Test;

import java.util.Scanner;

class Transaction {
    private String transactionType;
    private int accountNumber;
    private int amount = 10000000;

    public Transaction(String transactionType, int accountNumber, int amount) {
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void Amount() {
        System.out.println("Current Balance = " + amount);
    }

    public void creditAmount(int credit) {
        amount = amount + credit;
        System.out.println("Amount after Credit = " + amount);
    }

    public void debitAmount(int debit) {
        if (debit > amount) {
            throw new ArithmeticException("Insufficient Balance");
        } else {
            amount = amount - debit;
            System.out.println("Amount After Debit = " + amount);
        }
    }
}

class Customer extends Transaction {
    @Override
    public void Amount() {
        super.Amount();
    }

    @Override
    public void creditAmount(int credit) {
        super.creditAmount(credit);
    }

    @Override
    public void debitAmount(int debit) {
        super.debitAmount(debit);
    }

    private int id;
    private String name;
    private long mobile;
    private String email;

    public Customer(String transactionType, int accountNumber, int amount, int id, String name, long mobile, String email) {
        super(transactionType, accountNumber, amount);
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Q4 {
    public static void main(String[] args) {
        Customer customer = new Customer("Savings", 1234567890, 10000000, 1234, "Janhavi", 7972336615l, "janhavidahatonde@gmail.com");
        System.out.println(customer.toString());
        customer.Amount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to be credited: ");
        customer.creditAmount(sc.nextInt());
        System.out.println("Enter Amount to be debited: ");
        customer.debitAmount(sc.nextInt());

    }
}