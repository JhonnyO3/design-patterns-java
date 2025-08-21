package org.designpatterns.creational.factory.emailService;

import org.designpatterns.creational.factory.contact.Contact;
import org.designpatterns.creational.factory.repository.IContact;

import java.util.List;

public abstract class EmailService {

    protected abstract IContact createContact();

    public boolean send( String message) {
        List<Contact> contacts = createContact().getContacts();

        for (Contact contact : contacts) {
            System.out.println("====================================================");
            System.out.printf("Sending email to: %s (%s)%n", contact.getName(), contact.getEmail());
            System.out.printf("Message: %s%n", message);
            System.out.println("Email sent successfully!\n");
        }

        return true;
    }
}
