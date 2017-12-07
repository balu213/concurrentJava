package com.bala.interviews.practice.patterns;

/**
 * part of Creational design patterns
 * 
 * @author bala
 *
 */
public final class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
