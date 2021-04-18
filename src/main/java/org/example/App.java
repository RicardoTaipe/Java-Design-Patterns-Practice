package org.example;

import org.example.creational.builder.LunchOrder;
import org.example.creational.builder.WebsiteType;
import org.example.creational.factory.Website;
import org.example.creational.factory.WebsiteFactory;
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

        /*Factory*/
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(website.getPages());
        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(website.getPages());
    }
}
