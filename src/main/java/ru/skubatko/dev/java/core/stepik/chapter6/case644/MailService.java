package ru.skubatko.dev.java.core.stepik.chapter6.case644;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<AbstractPackage<T>> {

    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            List<T> list = super.get(key);
            return list == null ? Collections.emptyList() : list;
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(AbstractPackage<T> mailMessage) {
        String to = mailMessage.getTo();
        List<T> messages = mailBox.computeIfAbsent(to, k -> new ArrayList<>());
        messages.add(mailMessage.getContent());
    }

}
