package ru.skubatko.dev.java.core.stepik.chapter4.case432;

import ru.skubatko.dev.java.core.stepik.chapter4.case432.service.MailService;

/*
Класс, в котором скрыта логика настоящей почты
*/
public class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здесь описан код настоящей системы отправки почты.
        return mail;
    }

}
