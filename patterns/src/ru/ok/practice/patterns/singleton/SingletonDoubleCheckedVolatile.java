package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonDoubleCheckedVolatile {
    /**
     * Рабочий вариант начиная с Java 1.5, однако Allen Holub считает,
     * что тормозит на мультипроцессорных системах
     */

    private static volatile SingletonDoubleCheckedVolatile instance;

    private SingletonDoubleCheckedVolatile() {

    }

    public static SingletonDoubleCheckedVolatile getInstance() {
        if (instance == null)
            synchronized (SingletonDoubleCheckedVolatile.class) {
                if (instance == null)
                    instance = new SingletonDoubleCheckedVolatile();
            }
        return instance;
    }
}
