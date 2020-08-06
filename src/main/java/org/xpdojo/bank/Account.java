package org.xpdojo.bank;

public class Account {
    private double balance;
    public double balance() {
        return balance;
    }

    public void deposit(double v) {
        balance += v;
    }
}
