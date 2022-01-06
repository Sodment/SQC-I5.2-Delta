package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

/**
 * Abstrakcyjna klasa realizująca wzorzec projektowy 'wizytator'.
 */
public abstract class DisplayingVisitor
{
    /**
     * Wyświetla kroki.
     *
     * @param step obecnie rozpatrywany krok
     * @param parentNum numer kroku nadrzędnego
     * @param level poziom zagłębienia kroku
     */
    public abstract void display(Step step, String parentNum, int level);
}
