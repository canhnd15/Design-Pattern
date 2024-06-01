package com.davidnguyen.factory.methodfactory.logger;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.printf("Logging to file: %s \n", message);
    }
}
