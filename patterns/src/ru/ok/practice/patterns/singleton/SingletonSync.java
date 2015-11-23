package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonSync {
    /**
     * Нормальный вариант. В теории "медленно" из-за synchronized.
     */
    private static SingletonSync instance;

    private SingletonSync() {
        System.out.println(this.getClass() + " created");
    }

    public static synchronized SingletonSync getInstance() {
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }
}
