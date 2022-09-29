package Threads;

import java.util.Scanner;

public class BankTransaction {
    int totalAmount = 100000;
    synchronized void withdrawMoney(int amount) throws InsufficientBalance {
        if (amount > totalAmount){
            throw new InsufficientBalance("Insufficient Balance");
        }else {
            totalAmount = totalAmount - amount;
            System.out.println("Remaining Amount = " + totalAmount);
        }
    }
   synchronized void depositMoney(int amount){
        totalAmount = totalAmount+amount;
        System.out.println("Current Balance = "+totalAmount);
    }
}
class UserOne extends Thread{
    int amt;
    BankTransaction bankTransaction;
    UserOne(BankTransaction bankTransaction, int amt){
        this.bankTransaction = bankTransaction;
        this.amt = amt;
    };
    @Override
    public void run() {
        bankTransaction.depositMoney(amt);
    }
}
class UserTwo extends Thread{
    int amt;
    BankTransaction bankTransaction;
    UserTwo(BankTransaction bankTransaction, int amt){
        this.bankTransaction = bankTransaction;
        this.amt = amt;
    };
    @Override
    public void run() {
        try {
            bankTransaction.withdrawMoney(amt);
        } catch (InsufficientBalance e) {
            throw new RuntimeException(e);
        }
    }
}
class TransactionImpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for deposit");
        int amt = sc.nextInt();
        BankTransaction bankTransaction = new BankTransaction();
        UserOne t1 = new UserOne(bankTransaction, amt);
        UserTwo t2 = new UserTwo(bankTransaction, amt);
        t1.start();
        t2.start();
    }
}
