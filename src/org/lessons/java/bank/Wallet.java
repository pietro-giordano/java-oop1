package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Wallet {
    private int number;
    private String name;
    private double balance;

    public Wallet(String name) {
        Random number = new Random();
        this.number = number.nextInt(999) + 1;
        this.name = name;
        this.balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMoney(double money) {
        this.balance += money;
    }

    public String getFormattedBalance() {
        DecimalFormat format = new DecimalFormat("0.00");
        return format.format(getBalance()) + "€";
    }

    public void getMoney(double money) {
        if (this.balance - money > 0) {
            this.balance -= money;
        } else {
            System.out.println("Credito non sufficiente");
        }
    }
}
