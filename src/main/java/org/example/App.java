package org.example;

import org.example.creational.builder.LunchOrder;
import org.example.creational.singleton.LazySingleton;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*Singleton*/
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton);
        /*Builder*/
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);
    }
}
