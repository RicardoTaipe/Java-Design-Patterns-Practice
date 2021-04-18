package org.example.creational.factory;

import org.example.creational.builder.WebsiteType;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default:
                return null;
        }
    }
}
