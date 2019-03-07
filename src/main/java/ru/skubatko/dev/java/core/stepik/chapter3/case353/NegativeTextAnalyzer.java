package ru.skubatko.dev.java.core.stepik.chapter3.case353;

class NegativeTextAnalyzer extends KeywordAnalyzer {

    private static final String[] NEGATIVE_KEYWORDS = {":(", "=(", ":|"};

    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return NEGATIVE_KEYWORDS;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
