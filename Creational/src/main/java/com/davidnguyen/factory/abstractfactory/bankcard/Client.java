package com.davidnguyen.factory.abstractfactory.bankcard;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        BankCardFactory cardFactory;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Vietcombank: ");
        System.out.println("2. Techcombank: ");

        String bankType = scanner.next();

        cardFactory = switch (bankType) {
            case "VIETCOM" -> new VietcombankCardFactory();
            case "TECHCOM" -> new TechcombankCardFactory();
            default -> throw new IllegalArgumentException(bankType + " is not defined.");
        };

        // create special instants of bank card
        CreditCard creditCard = cardFactory.createCreditCard();
        DebitCard debitCard = cardFactory.createDebitCard();

        // do actions that bank cards
        System.out.printf("[%s][CREDIT] After withdraw 500.000 VND: %d \n", bankType, creditCard.withdraw(500_000));
        System.out.printf("[%s][CREDIT] After deposit 10.000.00 VND: %d \n", bankType, creditCard.deposit(10_000_000));

        System.out.printf("[%s][DEBIT] After withdraw 500.000 VND: %d \n", bankType, debitCard.withdraw(500_000));
        System.out.printf("[%s][DEBIT] After deposit 10.000.00 VND: %d \n", bankType, debitCard.deposit(10_000_000));
    }
}
