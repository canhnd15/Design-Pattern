package com.davidnguyen.factory.abstractfactory.bankcard;

public class TechcombankCardFactory implements BankCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new TechcombankCreditCard();
    }

    @Override
    public DebitCard createDebitCard() {
        return new TechcombankDebitCard();
    }
}
