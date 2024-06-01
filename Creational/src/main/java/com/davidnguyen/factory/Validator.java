package com.davidnguyen.factory;

public class Validator {
    public static boolean isValidAmount(int amount) {
        return amount > 0 && amount < 100_000_000;
    }
}
