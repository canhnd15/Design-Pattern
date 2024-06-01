package com.davidnguyen.factory.abstractfactory.items;

public class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("This is a click from Windows button.");
    }
}
