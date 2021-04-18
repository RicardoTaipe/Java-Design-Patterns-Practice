package org.example.creational.singleton;

public class ThreadSafeSingleton {
    public static volatile ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to create object");
        }
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
