package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

import java.util.ArrayList;

/**
 * Przechowuje kroki niezawierające aktorów.
 * Dziedziczy po abstrakcyjnej klasie implementując wzorzec projektowy 'wizytator'.
 */
public class NoActors extends Visitor{

    private ArrayList<String> stepsWithoutActors = new ArrayList<>();

    public ArrayList<String> getStepsWithoutActors() { return stepsWithoutActors; }

    public void setStepsCount(ArrayList<String> stepsWithoutActors) { this.stepsWithoutActors = stepsWithoutActors; }

    /**
     * Dodaje do listy kroków bez aktorów zawartość kroku.
     *
     * @param step Obecnie rozpatrywany krok
     */
    public void count(Step step)
    {
        if(!isActor(step)) {  stepsWithoutActors.add(String.join(" ", step.getContent())); }
    }

    /**
     * Sprawdza czy krok zawiera aktora.
     *
     * @param step Obecnie rozpatrywany krok
     * @return zwraca prawdę, jeżeli krok zawiera aktora
     */
    private boolean isActor(Step step) {
        if (!step.getActor().equals(""))
        {
            return true;
        }
        return false;
    }
}
