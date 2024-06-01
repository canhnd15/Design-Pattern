package com.davidnguyen.factory.abstractfactory.items;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button generateButton() {
        return new WindowsButton();
    }

    @Override
    public Screen generateScreen() {
        return new WindowsScreen();
    }
}
