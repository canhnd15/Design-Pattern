package com.davidnguyen.factory.abstractfactory.items;

public class MacOSButton implements Button{
    @Override
    public void click() {
        System.out.println("This is a click from MacOS button.");
    }
}
