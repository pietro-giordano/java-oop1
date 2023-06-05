package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product tv = new Product("Lg", "televisione bellissima", 999.99, 20);

        System.out.println("Codice prodotto: " + tv.getCode());
        System.out.println("Nome prodotto: " + tv.getName());
        System.out.println("Codice e prodotto: " + tv.getCodeName());
        System.out.println("Descrizione: " + tv.getDescription());
        System.out.println("Prezzo: " + tv.getPrice());
        System.out.println("Prezzo + IVA: " + tv.getIvaPrice());
    }
}
