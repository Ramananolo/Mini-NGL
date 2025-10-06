package com.prog2_rattrapage.prog2;

import com.prog2_rattrapage.prog2.controller.PublicationController;
import com.prog2_rattrapage.prog2.model.Message;
import com.prog2_rattrapage.prog2.model.Publication;
import com.prog2_rattrapage.prog2.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Prog2ApplicationTests {

	@Autowired
	private PublicationController publicationController;

	@Test
	public void testCreatePublication() {
		User user = new User("user1", "Marco", "Rakoto", "marco.com");
		Message message = new Message("Bonjour", new Date(), false);

		Publication publication = publicationController.createPublication(user, message);
	}

	@Test
	public void testAddMessageToPublication() {
		Publication publication = new Publication("publication1");
		Message message = new Message("hello", new Date(), false);

		publicationController.addMessageToPublication(publication.getId(), message);
	}

}
