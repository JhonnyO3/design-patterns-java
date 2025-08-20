package org.designpatterns.creational.factory.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.designpatterns.creational.factory.contact.Contact;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository {

    public List<Contact> getContactsFromJson(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(getClass().getClassLoader().getResourceAsStream(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Contact.class));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    public List<Contact> getContactsFromCsv(String filePath) {
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
