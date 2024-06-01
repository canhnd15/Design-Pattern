package com.davidnguyen.factory.methodfactory.logger;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.printf("Logging to console: %s \n", message);
    }
}
