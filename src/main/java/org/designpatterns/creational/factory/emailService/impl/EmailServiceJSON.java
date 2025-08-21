package org.designpatterns.creational.factory.emailService.impl;

import org.designpatterns.creational.factory.emailService.EmailService;
import org.designpatterns.creational.factory.repository.IContact;
import org.designpatterns.creational.factory.repository.impl.JSONContact;

public class EmailServiceJSON extends EmailService {

    private String filePath;

    public EmailServiceJSON(String filePath) {
        this.filePath = filePath;
    }

    @Override
    protected IContact createContact() {
        return new JSONContact(filePath);
    }
}
