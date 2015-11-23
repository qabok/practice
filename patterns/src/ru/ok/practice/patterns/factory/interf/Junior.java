package ru.ok.practice.patterns.factory.interf;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class Junior implements Tester {
    @Override
    public void test() {
        System.out.println("I'm not good in testing :(");
    }
}
