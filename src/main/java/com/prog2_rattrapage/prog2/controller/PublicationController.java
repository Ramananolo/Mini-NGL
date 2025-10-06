package com.prog2_rattrapage.prog2.controller;

import com.prog2_rattrapage.prog2.model.Message;
import com.prog2_rattrapage.prog2.model.Publication;
import com.prog2_rattrapage.prog2.model.User;
import com.prog2_rattrapage.prog2.service.PublicationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationController {
    private final PublicationService publicationService;

    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @PostMapping("/publications")
    public Publication createPublication(@RequestBody User user, @RequestBody Message message) {
        return publicationService.createPublication(user, message);
    }

    @PostMapping("/publications/{id}/messages")
    public void addMessageToPublication(@PathVariable String id, @RequestBody Message message) {
        publicationService.addMessageToPublication(id, message);
    }
}
