package com.davidnguyen.factory.methodfactory.logger;

public class FileLoggerFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
