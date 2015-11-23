package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonSimple {
    /**
     * �������� ������ ��� ������������ ����������. � ������������� ��������� ��������
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
