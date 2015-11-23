package ru.ok.practice.patterns.test;

import ru.ok.practice.patterns.builder.User;

/**
 * Created by sergey.tovmasyan on 23.11.2015.
 */
public class Builder {
    public static void main(String[] args) {
       User user = new User.UserBuilder("Vasia", "Pupkin")
                .age(30)
                .phone("+7000111222333")
                .address("Fake address 1234")
                .build();

        System.out.println(user);
    }
}
