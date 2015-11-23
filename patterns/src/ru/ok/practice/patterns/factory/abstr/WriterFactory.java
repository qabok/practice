package ru.ok.practice.patterns.factory.abstr;

import javax.swing.text.Document;
import java.io.File;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class WriterFactory {
    public static Writer getWriter(Object object) {
        Writer writer = null;
        if (object instanceof File) {
            writer = new FileWriter();
        } else if (object instanceof Document) {
            writer = new XmlWriter();
        }
        return writer;
    }
}
