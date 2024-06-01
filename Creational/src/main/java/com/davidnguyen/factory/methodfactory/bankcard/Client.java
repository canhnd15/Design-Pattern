package com.davidnguyen.factory.methodfactory.bankcard;

public class Client {
    public static void main(String[] args) {
        BankCardFactory creditCard = new CreditCardFactory();
        System.out.printf("[CREDIT] After withdraw 1.500.000 VND: %d \n", creditCard.withdraw(1_500_000));
        System.out.printf("[CREDIT] After deposit 500.000 VND: %d \n", creditCard.deposit(500_000));

        BankCardFactory debitCard = new DebitCardFactory();
        System.out.printf("[DEBIT] After withdraw 1.500.000 VND: %d \n", debitCard.withdraw(1_500_000));
        System.out.printf("[DEBIT] After deposit 500.000 VND: %d \n", debitCard.deposit(500_000));
    }
}
