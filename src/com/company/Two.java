package com.company;

import java.util.List;

// 2. Using a method references on my code
public class Two {
    public static void main(String[] args) {
        var emails = List.of("Slamet@gmail.com", "Abdul@live.com");
        var names = emails.stream()
                .map(Two::getNameFromEmail) // email -> getNameFromEmail(email)
                .map(String::toLowerCase) // name -> name.toLowerCase()
                .toList();

        System.out.println(names);
    }

    public static String getNameFromEmail(String email) {
        return email.substring(0, email.indexOf("@"));
    }
}
