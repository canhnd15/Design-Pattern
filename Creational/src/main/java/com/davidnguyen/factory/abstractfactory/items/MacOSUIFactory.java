package com.davidnguyen.factory.abstractfactory.items;

public class MacOSUIFactory implements UIFactory{
    @Override
    public Button generateButton() {
        return new MacOSButton();
    }

    @Override
    public Screen generateScreen() {
        return new MacOSScreen();
    }
}
