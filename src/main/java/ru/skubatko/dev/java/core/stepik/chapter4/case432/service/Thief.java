package ru.skubatko.dev.java.core.stepik.chapter4.case432.service;

import ru.skubatko.dev.java.core.stepik.chapter4.case432.MailPackage;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.Package;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.Sendable;

public class Thief implements MailService {

    private final int minPrice;
    private int stolenValue;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (!(mail instanceof MailPackage)) return mail;

        int packagePrice = ((MailPackage) mail).getContent().getPrice();
        if (packagePrice < minPrice) return mail;

        Package content = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
        MailPackage newMail = new MailPackage(mail.getFrom(), mail.getTo(), content);
        stolenValue += packagePrice;
        return newMail;
    }

}
