package com.davidnguyen.factory.methodfactory.logger;

public class DatabaseLoggerFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
