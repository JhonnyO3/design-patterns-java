package org.designpatterns.creational.factory.repository.impl;

import org.designpatterns.creational.factory.contact.Contact;
import org.designpatterns.creational.factory.repository.IContact;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CSVContact implements IContact {

    private String filePath;

    public CSVContact(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (int i = 1; i < lines.size(); i++) {
                String[] fields = lines.get(i).split(",");
                Contact contact = new Contact();
                contact.setName(fields[0].trim());
                contact.setEmail(fields[2].trim());
                contacts.add(contact);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
        return contacts;
    }
}
