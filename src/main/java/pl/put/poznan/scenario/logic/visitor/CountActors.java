package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

/**
 * Zlicza kroki w scenariuszu dla poszczególnych aktorów.
 * Dziedziczy po abstrakcyjnej klasie implementując wzorzec projektowy 'wizytator'.
 */

public class CountActors extends CountingVisitor
{
    private long numberOfSystemActors;
    private long numberOfActors;

    public long getNumberOfSystemActors() { return numberOfSystemActors; }

    public long getNumberOfActors() { return numberOfActors; }

    public void setNumberOfSystemActors(long numberOfSystemActors) { this.numberOfSystemActors = numberOfSystemActors; }

    public void setNumberOfActors(long numberOfActors) { this.numberOfActors = numberOfActors; }

    /**
     * Inkrementuje liczbę kroków dla danego rodzaju aktorów w scenariuszu.
     *
     * @param step Obecnie rozpatrywany krok
     */

    @Override
    public void count(Step step)
    {
        if (step.getActor().equals("System")) { numberOfSystemActors++; }
        else { numberOfActors++; }
    }

    /**
     * Funkcja zwracająca wiadomość z liczbą kroków do zapisania do pliku JSON
     *
     * @return zwraca liczbę kroków dla poszczególnych aktorów
     */
    public String getActors() { return "System actors: " + numberOfSystemActors + "\n" + "Non-system actors: " + numberOfActors; }

}
