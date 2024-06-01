package com.davidnguyen.factory.methodfactory.logger;

public abstract class LoggerFactory {
    public abstract Logger createLogger();

    public void writeLog(String message) {
        Logger logger = createLogger();
        logger.log(message);
    }
}
