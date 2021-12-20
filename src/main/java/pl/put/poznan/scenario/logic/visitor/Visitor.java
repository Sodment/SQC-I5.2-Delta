package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

/**
 * Abstrakcyjna klasa realizująca wzorzec projektowy 'wizytator'.
 */
abstract public class Visitor
{
    /**
     * Zlicza kroki.
     *
     * @param step Obecnie rozpatrywany krok
     */
    public abstract void count(Step step);
}
