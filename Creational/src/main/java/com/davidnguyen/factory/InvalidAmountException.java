package com.davidnguyen.factory;

public class InvalidAmountException extends RuntimeException{
     public InvalidAmountException(String message) {
         super(message);
     }
}
