package pl.put.poznan.scenario.model;

import pl.put.poznan.scenario.logic.visitor.KeyWords;
import pl.put.poznan.scenario.logic.visitor.Visitor;

import java.util.List;

public class Scenario {
    private String title;
    private List<String> actors;
    private List<Step> steps;

    public void acceptCounting(Visitor visitor)
    {
        for(Step step : steps)
        {
            step.acceptCounting(visitor);
        }
    }

    public Scenario() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<Step> getSteps() { return steps; }

    public void setSteps(List<Step> steps) { this.steps = steps; }

}

