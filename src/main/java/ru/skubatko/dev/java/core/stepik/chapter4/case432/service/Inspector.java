package ru.skubatko.dev.java.core.stepik.chapter4.case432.service;

import ru.skubatko.dev.java.core.stepik.chapter4.case432.MailPackage;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.Sendable;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.service.exception.IllegalPackageException;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.service.exception.StolenPackageException;

import static ru.skubatko.dev.java.core.stepik.chapter4.case432.Case432.BANNED_SUBSTANCE;
import static ru.skubatko.dev.java.core.stepik.chapter4.case432.Case432.WEAPONS;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        if (!(mail instanceof MailPackage)) return mail;

        String content = ((MailPackage) mail).getContent().getContent();
        if (WEAPONS.equals(content) || BANNED_SUBSTANCE.equals(content))
            throw new IllegalPackageException();

        if (content.contains("stones"))
            throw new StolenPackageException();

        return mail;
    }

}
