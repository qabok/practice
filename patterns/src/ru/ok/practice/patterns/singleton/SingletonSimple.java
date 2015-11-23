package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonSimple {
    /**
     * Подходит только для однопоточных приложений. В многопоточном возникают проблемы
     */
    private static SingletonSimple instance;


    private SingletonSimple() {

    }

    public static SingletonSimple getInstance() {
        if (instance == null) {
            instance = new SingletonSimple();
        }
        return instance;
    }
}
