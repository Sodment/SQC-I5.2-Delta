package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

public abstract class DisplayingVisitor
{
    public abstract void display(Step step, String parentNum, int level);
}
