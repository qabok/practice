package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonDoubleChecked {
    /**
     * �� ����� ���� ���� ����������� ������� ����� ��������
     * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
     * ��� ���, ���� ������ ����� singleton ���-����, ����� �������� �������� � ���������� ������ ����
     */
    private static SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {

    }

    public static SingletonDoubleChecked getInstance() {
        if (instance == null)
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null)
                    instance = new SingletonDoubleChecked();
            }
        return instance;
    }
}
