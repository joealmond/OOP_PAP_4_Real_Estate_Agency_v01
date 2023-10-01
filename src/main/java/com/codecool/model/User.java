package com.codecool.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class User {
    private final String name;
    private final String contact;

    public User(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public Map<String, String> sendDirectMessage(String message, User recipient) {
        Map<String, String> dm = new HashMap<>();
        dm.put("from", name);
        dm.put("contect", contact);
        dm.put("to", recipient.name);
        dm.put("message", message);
        System.out.println("A direct message has been sent to " + recipient.name + "...");
        return Collections.unmodifiableMap(dm);
    }

    public String getName() {
        return name;
    }
}
