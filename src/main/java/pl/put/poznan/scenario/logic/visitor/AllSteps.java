package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

/**
 * Zlicza wszystkie kroki w scenariuszu.
 * Dziedziczy po abstrakcyjnej klasie implementując wzorzec projektowy 'wizytator'.
 */
public class AllSteps extends CountingVisitor {
    private long stepsCount = 0;


    public long getStepsCount() {return stepsCount;}

    public void setStepsCount(long stepsCount) { this.stepsCount = stepsCount; }

    /**
     * Inkrementuje liczbę kroków w scenariuszu.
     *
     * @param step Obecnie rozpatrywany krok
     */
    public void count(Step step) { stepsCount++; }
}
