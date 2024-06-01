package com.davidnguyen.factory.abstractfactory.items;

public class WindowsScreen implements Screen{
    @Override
    public void display() {
        System.out.println("This is display from Windows screen.");
    }
}
