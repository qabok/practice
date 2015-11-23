package ru.ok.practice.patterns.factory.abstr;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class XmlWriter extends Writer {
    @Override
    public void write(Object context) {
        System.out.println(context.toString() + " write to file in xml format");
    }
}
