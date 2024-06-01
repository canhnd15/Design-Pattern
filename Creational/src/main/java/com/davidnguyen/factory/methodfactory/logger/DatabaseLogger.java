package com.davidnguyen.factory.methodfactory.logger;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.printf("Logging to database: %s \n", message);
    }
}
