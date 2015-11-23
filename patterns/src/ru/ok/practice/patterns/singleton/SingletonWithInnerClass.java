package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonWithInnerClass {
    /**
     * Решается проблема ленивой инициализации, так как объект создаётся при первом вызове
     * метода getInstance(). Но обрабатывать исключительные ситуации в конструкторе по-прежнему не можем
     */
    private SingletonWithInnerClass() {

    }

    private static class SingletonHolder {
        private static final SingletonWithInnerClass instance = new SingletonWithInnerClass();
    }

    public static SingletonWithInnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
