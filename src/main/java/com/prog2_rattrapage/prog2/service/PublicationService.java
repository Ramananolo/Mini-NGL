package com.prog2_rattrapage.prog2.service;

import com.prog2_rattrapage.prog2.model.Message;
import com.prog2_rattrapage.prog2.model.Publication;
import com.prog2_rattrapage.prog2.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PublicationService {
    private final List<Publication> publications = new ArrayList<>();

    public Publication createPublication(User user, Message message) {
        Publication publication = new Publication(UUID.randomUUID().toString());
        publications.add(publication);
        return publication;
    }

    public void addMessageToPublication(String id, Message message) {
        Publication publication = getPublication(id);
        if (publication != null) {
            publication.addMessage(message);
        }
    }

    private Publication getPublication(String id) {
        return null;
    }
}
