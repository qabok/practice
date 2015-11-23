package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonDoubleCheckedVolatile {
    /**
     * ������� ������� ������� � Java 1.5, ������ Allen Holub �������,
     * ��� �������� �� ������������������ ��������
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
