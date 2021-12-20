package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

public class NoActors extends Visitor{

    private long stepsCount = 0;

    public long getStepsCount() { return stepsCount; }

    public void setStepsCount(long stepsCount) { this.stepsCount = stepsCount; }

    public void count(Step step)
    {
        if(!isActor(step)) { stepsCount++; }
    }

    private boolean isActor(Step step) {
        if (!step.getActor().equals(""))
        {
            return true;
        }
        return false;
    }
}
