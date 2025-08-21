package org.designpatterns.creational.factory.emailService.impl;

import org.designpatterns.creational.factory.emailService.EmailService;
import org.designpatterns.creational.factory.repository.IContact;
import org.designpatterns.creational.factory.repository.impl.CSVContact;

public class EmailServiceCSV extends EmailService {

    private String filePath;

    public EmailServiceCSV(String filePath) {
        this.filePath = filePath;
    }

    @Override
    protected IContact createContact() {
        return new CSVContact(filePath);
    }
}
