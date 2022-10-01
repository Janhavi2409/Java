package Threads;


class Bank {
    int totalAmount = 0;

    synchronized void deposit(int amount) {
        totalAmount += amount;
        System.out.println("Total Amount " + totalAmount);
        notify();
    }

    synchronized void withdrawMoney(int amount) throws InterruptedException {
        if (amount > totalAmount) {
            System.out.println("Insufficient Balance");
            wait();
        }
        totalAmount -= amount;
        System.out.println("Remaining Amount " + totalAmount);
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        new Thread() {
            @Override
            public void run() {
                try {
                    bank.withdrawMoney(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();
        bank.deposit(200);
    }
}

