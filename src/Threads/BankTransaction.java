package Threads;

import java.util.Scanner;

public class BankTransaction {
    int totalAmount = 0;
    synchronized int withdrawMoney(int amount) throws InsufficientBalance{
        if (amount > totalAmount) {
            throw new InsufficientBalance("Insufficient balance ");
        }else {
            totalAmount = totalAmount - amount;
            return totalAmount;
        }
    }
    synchronized int depositMoney(int amount){
        totalAmount = totalAmount + amount;
        return totalAmount;

    }
}
class UserOne extends Thread{
    int amt;
    BankTransaction bankTransaction;
    UserOne(BankTransaction bankTransactions, int amt){
        this.bankTransaction = bankTransaction;
        this.amt = amt;
    }
    @Override
    public void run() {
        System.out.println("Current "+bankTransaction.depositMoney(amt));
    }
}
class UserTwo extends Thread{
    int amt;
    BankTransaction bankTransaction;
    UserTwo(BankTransaction bankTransactions, int amt){
        this.bankTransaction = bankTransaction;
        this.amt = amt;
    }
    @Override
    public void run() {
        try {
            System.out.println("Remaining "+bankTransaction.withdrawMoney(amt));
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}

class TransactionImpl{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deposit amount");
        int deposit = sc.nextInt();

        BankTransaction bankTransaction = new BankTransaction();
        UserOne t1 = new UserOne(bankTransaction,deposit);
        t1.start();
           t1.join();
        System.out.println("Enter withdrawal amount");
        int withdraw = sc.nextInt();
        UserTwo t3 = new UserTwo(bankTransaction,withdraw);
        t3.start();

    }
}
