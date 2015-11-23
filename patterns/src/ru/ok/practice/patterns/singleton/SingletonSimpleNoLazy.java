package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonSimpleNoLazy {
    /**
     * �������� ��������������� ������, �� ��� "������� �������������" � ����������� ������������
     * ���������� � ������������
     */
    private static SingletonSimpleNoLazy instance = new SingletonSimpleNoLazy();

    private SingletonSimpleNoLazy() /** no way to throw Exception */  {
        System.out.println(this.getClass() + " created");
    }

    public static SingletonSimpleNoLazy getInstance() {
        return instance;
    }
}
