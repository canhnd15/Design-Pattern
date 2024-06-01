package com.davidnguyen.factory.methodfactory.logger;

public class Client {
    public static void main(String[] args) {
        LoggerFactory fileLogger = new FileLoggerFactory();
        fileLogger.writeLog("This is a file log message.");

        LoggerFactory consoleLogger = new ConsoleLoggerFactory();
        consoleLogger.writeLog("This is a console log message.");

        LoggerFactory databaseLogger = new DatabaseLoggerFactory();
        databaseLogger.writeLog("This is a database log message.");
    }
}
