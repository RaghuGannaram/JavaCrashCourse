package locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankSystem {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(5000);

        ATM atm1 = new ATM("ATM 1", account);
        ATM atm2 = new ATM("ATM 2", account);

        // Creating two ATM threads
        Thread atmThread1 = new Thread(atm1);
        Thread atmThread2 = new Thread(atm2);

        // Starting both ATM threads
        atmThread1.start();
        atmThread2.start();

        // Waiting for both ATMs to finish
        atmThread1.join();
        atmThread2.join();

        System.out.println("All transactions completed. Final balance: " + account.getBalance());
    }
}

class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money with explicit lock
    public void withdraw(String atmName, double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                System.out.println(atmName + " is withdrawing: " + amount);
                balance -= amount;
                System.out.println(atmName + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(atmName + " attempted to withdraw: " + amount + " but insufficient funds.");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}

class ATM implements Runnable {
    private String atmName;
    private BankAccount account;

    public ATM(String atmName, BankAccount account) {
        this.atmName = atmName;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.withdraw(atmName, 1000);
            try {
                // Simulating different processing times for each ATM
                switch (this.atmName) {
                    case "ATM 1":
                        Thread.sleep(10);
                        break;
                    case "ATM 2":
                        Thread.sleep(5);
                        break;
                    default:
                        Thread.sleep(50);
                        break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
