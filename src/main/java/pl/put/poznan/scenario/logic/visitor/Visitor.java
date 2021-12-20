package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

abstract public class Visitor
{
    public abstract void count(Step step);
}
