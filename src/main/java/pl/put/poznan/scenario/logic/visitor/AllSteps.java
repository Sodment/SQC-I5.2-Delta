package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

public class AllSteps extends Visitor{
    private long stepsCount;

    public long getStepsCount() {return stepsCount;}

    public void count(Step step) { stepsCount++; }
}
