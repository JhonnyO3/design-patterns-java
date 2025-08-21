package org.designpatterns.creational.factory;

import org.designpatterns.creational.factory.emailService.EmailService;
import org.designpatterns.creational.factory.emailService.impl.EmailServiceJSON;

public class MainService {

    public static void main(String[] args) {
        EmailService email = new EmailServiceJSON("contacts.json");
        String message = """
                Hello, this is a test message.
                Best regards,
                Your Company""";

        boolean status = email.send(message);

    }
}
