package org.lessons.java.bank;

public class Wallet {
    private int number;
    private String name;
    private double balance;

    public Wallet(int number, String name, double balance) {
        this.number = number;
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

    public void getMoney(double money) {
        if (this.balance - money > 0) {
            this.balance -= money;
        } else {
            System.out.println("Credito non sufficiente");
        }
    }
}