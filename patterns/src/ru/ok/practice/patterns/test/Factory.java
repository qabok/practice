package ru.ok.practice.patterns.test;

import ru.ok.practice.patterns.factory.abstr.Writer;
import ru.ok.practice.patterns.factory.abstr.WriterFactory;
import ru.ok.practice.patterns.factory.interf.Tester;
import ru.ok.practice.patterns.factory.interf.TesterFactory;

import java.io.File;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class Factory {
    public static void main(String[] args) {
        Writer writer = WriterFactory.getWriter(new File("aaa.txt"));
        writer.write("blablabla");

        Tester tester = TesterFactory.getTester("hardTask");
        tester.test();
    }
}
