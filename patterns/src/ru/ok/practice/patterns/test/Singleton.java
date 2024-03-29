package ru.ok.practice.patterns.test;

import ru.ok.practice.patterns.singleton.*;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class Singleton {
    public static void main(String[] args) {
        SingletonSimple singletonSimple = SingletonSimple.getInstance();
        SingletonSimpleNoLazy singletonSimpleNoLazy = SingletonSimpleNoLazy.getInstance();
        SingletonWithInnerClass singletonWithInnerClass = SingletonWithInnerClass.getInstance();
        SingletonSync singletonSync = SingletonSync.getInstance();
        SingletonDoubleChecked singletonDoubleChecked = SingletonDoubleChecked.getInstance();
        SingletonDoubleCheckedVolatile singletonDoubleCheckedVolatile = SingletonDoubleCheckedVolatile.getInstance();
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;

        /**
         * ��������� ��� ���, �� ������� �� ����������, ��� ��� singleton
         */
        SingletonSimple.getInstance();
        SingletonSimpleNoLazy.getInstance();
        SingletonWithInnerClass.getInstance();
        SingletonSync.getInstance();
        SingletonDoubleChecked.getInstance();
        SingletonDoubleCheckedVolatile.getInstance();
        singletonEnum = SingletonEnum.INSTANCE;
    }
}
