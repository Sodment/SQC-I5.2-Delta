package pl.put.poznan.scenario.model;

import java.util.List;

public class Scenario {
    private String title;
    private List<String> actors;

    public Scenario() {
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}

