package com.davidnguyen.factory.simplefactory;

public class BankCardSimpleFactory {
    public static BankCard createBankCard(String type) {
        if("CREDIT".equals(type)) {
            return new CreditCard();
        } else if("DEBIT".equals(type)) {
            return new DebitCard();
        }
        throw new IllegalArgumentException(type + " is invalid.");
    }
}
