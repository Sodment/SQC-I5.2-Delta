package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

import java.util.ArrayList;

public class NoActors extends Visitor{

    private ArrayList<String> stepsWithoutActors = new ArrayList<>();

    public ArrayList<String> getStepsWithoutActors() { return stepsWithoutActors; }

    public void setStepsCount(ArrayList<String> stepsWithoutActors) { this.stepsWithoutActors = stepsWithoutActors; }

    public void count(Step step)
    {
        if(!isActor(step)) {  stepsWithoutActors.add(String.join(" ", step.getContent())); }
    }

    private boolean isActor(Step step) {
        if (!step.getActor().equals(""))
        {
            return true;
        }
        return false;
    }
}
