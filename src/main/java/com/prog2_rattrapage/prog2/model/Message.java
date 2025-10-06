package com.prog2_rattrapage.prog2.model;
import lombok.Data;

import java.util.Date;
@Data
public class Message {
    private String text;
    private Date creationDate;
    private boolean confidential;

    public Message(String text, Date creationDate, boolean confidential) {
        this.text = text;
        this.creationDate = creationDate;
        this.confidential = confidential;
    }
}
