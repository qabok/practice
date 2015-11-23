package ru.ok.practice.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class SingletonDoubleChecked {
    /**
     * На самом деле есть объективная критика этого варианта
     * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
     * Так что, если видите такой singleton где-либо, стоит обратить внимание и перечитать статью выше
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
