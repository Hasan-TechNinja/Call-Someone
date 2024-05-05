package org.oop;

import org.oop.phone.Phone;

public class User {
    private final String name;
    private final Phone phone;

    public User(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }
}
