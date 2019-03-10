package ru.skubatko.dev.java.core.stepik.chapter4.case432.service;

import ru.skubatko.dev.java.core.stepik.chapter4.case432.Sendable;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
public interface MailService {

    Sendable processMail(Sendable mail);

}
