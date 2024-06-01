package com.davidnguyen.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        BankCard creditCard = BankCardSimpleFactory.createBankCard("CREDIT");
        System.out.printf("[CREDIT] Balance after withdraw 1.000.000 VND is: %d \n" , creditCard.withdraw(1_000_000));

        BankCard debitCard = BankCardSimpleFactory.createBankCard("DEBIT");
        System.out.printf("[DEBIT] Balance after withdraw 1.000.000 VND is: %d \n", debitCard.withdraw(1_000_000));
    }
}
