package com.davidnguyen.factory.abstractfactory.bankcard;

public interface BankCardFactory {
    CreditCard createCreditCard();
    DebitCard createDebitCard();
}
