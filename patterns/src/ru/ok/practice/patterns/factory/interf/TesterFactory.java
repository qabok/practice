package ru.ok.practice.patterns.factory.interf;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class TesterFactory {
    public static  Tester getTester(String taskType) {
        if ("simpleTask".equals(taskType)) {
            return new Junior();
        } else if ("mediumTask".equals(taskType)) {
            return new Middle();
        } else if ("hardTask".equals(taskType)) {
            return new Senior();
        }
        return null;
    }
}
