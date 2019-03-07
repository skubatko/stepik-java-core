package ru.skubatko.dev.java.core.stepik.chapter3.case353;

public class Case353 {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label label;
        for (TextAnalyzer analyzer : analyzers) {
             label = analyzer.processText(text);
             if (label != Label.OK) return label;
        }
        return Label.OK;
    }

}
