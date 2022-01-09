package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

import java.util.List;

/**
 * Zlicza liczbę kroków zawierających słowa kluczowe.
 * Dziedziczy po abstrakcyjnej klasie implementując wzorzec projektowy 'wizytator'.
 */
public class KeyWords extends CountingVisitor {
    private long stepsCount = 0;

    public long getStepsCount() {
        return stepsCount;
    }

    /**
     * Inkrementuje liczbę kroków w scenariuszu.
     *
     * @param step Obecnie rozpatrywany krok
     */
    @Override
    public void count(Step step) {
        if(isKeyWord(step)) {
            stepsCount++;
        }
    }

    public void setStepsCount(long stepsCount) { this.stepsCount = stepsCount; }

    /**
     * Sprawdza czy krok zawiera słowo kluczowe.
     *
     * @param step Obecnie rozpatrywany krok
     * @return zwraca prawdę, gdy krok zawiera słowo kluczowe
     */
    public static boolean isKeyWord(Step step) {
        List<String> text = step.getContent();
        return text.get(0).equals("IF") || text.get(0).equals("FOR EACH") || text.get(0).equals("ELSE");
    }
}
