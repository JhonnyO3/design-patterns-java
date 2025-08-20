package org.designpatterns.creational.factory.emailService;

import org.designpatterns.creational.factory.contact.Contact;
import org.designpatterns.creational.factory.repository.ContactRepository;

import java.util.List;

public class EmailService {


    public boolean send(String contactPath, String message) {
        ContactRepository contactRepository = new ContactRepository();

        List<Contact> contacts = contactRepository.getContactsFromJson(contactPath);

        for (Contact contact : contacts) {
            System.out.printf("Sending email to: %s (%s)%n", contact.getName(), contact.getEmail());
            System.out.printf("Message: %s%n", message);
            System.out.println("Email sent successfully!\n");
        }

        return true;
    }
}
