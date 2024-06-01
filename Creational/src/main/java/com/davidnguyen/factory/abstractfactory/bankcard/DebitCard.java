package com.davidnguyen.factory.abstractfactory.bankcard;

public interface DebitCard {
    int withdraw(int amount);
    int deposit(int amount);
}
