package com.davidnguyen.factory.abstractfactory.items;

public class MacOSScreen implements Screen{
    @Override
    public void display() {
        System.out.println("This is display from MacOS screen.");
    }
}
