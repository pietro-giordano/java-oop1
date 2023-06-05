package org.lessons.java.shop;

import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    public Product(String name, String description, double price, int iva) {
        Random code = new Random();
        this.code = code.nextInt(89999999) + 10000000;
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getIvaPrice() {
        return this.price + (this.price * this.iva);
    }

    public String getCodeName() {
        return this.code + "-" + this.name;
    }
}
