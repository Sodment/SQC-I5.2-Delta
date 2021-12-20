package pl.put.poznan.scenario.model;

import java.util.List;

public class Scenario {
    private String title;
    private List<String> actors;
    private List<String> system_actors;
    private List<Step> steps;

    public Scenario() { }

    public String getTitle() { return title; }

    public List<String> getActors() { return actors; }

    public List<String> getSystemActors() {
        return system_actors;
    }

    public List<Step> getSteps () { return steps; }

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
    public void setSystemActors(List<String> system_actors) {
        this.system_actors = system_actors;
    }

    public void setSteps(List<Step> steps) { this.steps = steps; }
}

