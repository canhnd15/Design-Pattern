package com.davidnguyen.factory.methodfactory.bankcard;

public class DebitCardFactory extends BankCardFactory{
    @Override
    public BankCard createBankCard() {
        return new DebitCard();
    }
}
