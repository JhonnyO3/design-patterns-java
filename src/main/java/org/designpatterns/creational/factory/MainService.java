package org.designpatterns.creational.factory;

import org.designpatterns.creational.factory.emailService.EmailService;

public class MainService {

    public static void main(String[] args) {
        EmailService email = new EmailService();
        String message = """
                Hello, this is a test message.
                Best regards,
                Your Company""";

        boolean status = email.send("contacts.json", message);

    }
}
