package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisca nome intestatario del conto: ");
        String name = scanner.nextLine();

        Wallet newWallet = new Wallet(name);

        boolean flag = false;
        do {
            System.out.println("Scegli tra le seguenti opzioni:");
            System.out.println("1> Versa soldi:");
            System.out.println("2> Preleva soldi:");
            System.out.println("0> Esci dal programma");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Arrivederci!");
                    flag = true;
                    break;
                case 1:
                    System.out.println("Quanto vuoi versare?");
                    newWallet.addMoney(scanner.nextDouble());
                    System.out.println("Saldo attuale: " + newWallet.getBalance());
                    break;
                case 2:
                    System.out.println("Quanto vuoi prelevare?");
                    newWallet.getMoney(scanner.nextDouble());
                    System.out.println("Saldo attuale: " + newWallet.getBalance());
                    break;
                default:
                    System.out.println("Scelta errata, riprova.");
            }
        } while (!flag);
    }
}
