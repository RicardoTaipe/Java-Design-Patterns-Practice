package org.example.creational.factory;

public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new ContactPage());
        pages.add(new CartPage());
    }
}
