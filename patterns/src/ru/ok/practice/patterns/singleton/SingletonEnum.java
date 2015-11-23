package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.out.println(this.getClass() + " created");
    }
}
