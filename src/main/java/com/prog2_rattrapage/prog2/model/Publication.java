package com.prog2_rattrapage.prog2.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Publication {
    private String id;
    private List<Message> messages;

    public Publication(String id) {
        this.id = id;
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
}
