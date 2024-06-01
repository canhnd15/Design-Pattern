package com.davidnguyen.factory.abstractfactory.items;

public class Client {
    public static void main(String[] args) {
        UIFactory factory;

        // Get the OS type
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            factory = new WindowsUIFactory();
        } else if (os.contains("mac")) {
            factory = new MacOSUIFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS");
        }

        // generate elements
        Button button = factory.generateButton();
        Screen screen = factory.generateScreen();

        // elements actions.
        button.click();
        screen.display();
    }
}
