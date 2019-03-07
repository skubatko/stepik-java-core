package ru.skubatko.dev.java.core.stepik.chapter3.case353;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String negativeKeyword : getKeywords())
            if (text.contains(negativeKeyword)) return getLabel();

        return Label.OK;
    }

}
