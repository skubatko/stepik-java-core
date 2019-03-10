package ru.skubatko.dev.java.core.stepik.chapter4.case432.service;

import ru.skubatko.dev.java.core.stepik.chapter4.case432.MailMessage;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.Sendable;

import java.util.logging.Level;
import java.util.logging.Logger;

import static ru.skubatko.dev.java.core.stepik.chapter4.case432.Case432.AUSTIN_POWERS;

public class Spy implements MailService {

    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (!(mail instanceof MailMessage)) return mail;

        logger.setLevel(Level.ALL);

        String from = mail.getFrom();
        String to = mail.getTo();
        if (AUSTIN_POWERS.equals(from) || AUSTIN_POWERS.equals(to))
            logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                    new Object[]{from, to, ((MailMessage) mail).getMessage()});
        else
            logger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{from, to});

        return mail;
    }

}
