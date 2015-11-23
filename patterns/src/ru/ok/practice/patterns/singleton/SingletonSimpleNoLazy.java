package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonSimpleNoLazy {
    /**
     * Проблема многопоточности решена, но нет "ленивой инициализации" и возможности обрабатывать
     * исключения в конструкторе
     */
    private static SingletonSimpleNoLazy instance = new SingletonSimpleNoLazy();

    private SingletonSimpleNoLazy() /** no way to throw Exception */  {
        System.out.println(this.getClass() + " created");
    }

    public static SingletonSimpleNoLazy getInstance() {
        return instance;
    }
}
