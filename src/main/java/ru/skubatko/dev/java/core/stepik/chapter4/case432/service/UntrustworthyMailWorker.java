package ru.skubatko.dev.java.core.stepik.chapter4.case432.service;

import ru.skubatko.dev.java.core.stepik.chapter4.case432.RealMailService;
import ru.skubatko.dev.java.core.stepik.chapter4.case432.Sendable;

public class UntrustworthyMailWorker implements MailService {

    private MailService[] mailServices;
    private RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        realMailService = new RealMailService();
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for (MailService mailService : mailServices)
                mail = mailService.processMail(mail);

        return realMailService.processMail(mail);
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

}
