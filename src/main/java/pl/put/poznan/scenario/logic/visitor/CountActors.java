package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

public class CountActors extends CountingVisitor
{
    private long numberOfSystemActors;
    private long numberOfActors;

    public long getNumberOfSystemActors() { return numberOfSystemActors; }

    public long getNumberOfActors() { return numberOfActors; }

    public void setNumberOfSystemActors(long numberOfSystemActors) { this.numberOfSystemActors = numberOfSystemActors; }

    public void setNumberOfActors(long numberOfActors) { this.numberOfActors = numberOfActors; }

    @Override
    public void count(Step step)
    {
        if (step.getActor().equals("System")) { numberOfSystemActors++; }
        else { numberOfActors++; }
    };

    public String getActors() { return "System actors: " + numberOfSystemActors + "\n" + "Non-system actors: " + numberOfActors; }

}
