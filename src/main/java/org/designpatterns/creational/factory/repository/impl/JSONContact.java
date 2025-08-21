package org.designpatterns.creational.factory.repository.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.designpatterns.creational.factory.contact.Contact;
import org.designpatterns.creational.factory.repository.IContact;

import java.util.List;

public class JSONContact implements IContact {

    private String filePath;


    public JSONContact(String filePath) {
        this.filePath = filePath;
    }


    @Override
    public List<Contact> getContacts() {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(getClass().getClassLoader().getResourceAsStream(filePath),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Contact.class));
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
