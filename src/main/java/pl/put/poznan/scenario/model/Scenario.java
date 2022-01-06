package pl.put.poznan.scenario.model;


import pl.put.poznan.scenario.logic.visitor.CountingVisitor;
import pl.put.poznan.scenario.logic.visitor.DisplayingVisitor;
import pl.put.poznan.scenario.logic.visitor.LevelViewer;
import pl.put.poznan.scenario.logic.visitor.ScenarioViewer;


import java.util.List;

/**
 * Klasa przechowująca dane o scenariuszu.
 *
 */
public class Scenario {
    private String title;
    private List<String> actors;
    private List<String> system_actors;
    private List<Step> steps;

    /**
     * @param countingVisitor obiekt klasy Visitor
     */
    public void acceptCounting(CountingVisitor countingVisitor)
    {
        for(Step step : steps)
        {
            step.acceptCounting(countingVisitor);
        }
    }

    public void acceptDisplaying(DisplayingVisitor visitor)
    {
        if(visitor instanceof ScenarioViewer)
            ((ScenarioViewer)visitor).setScenarioText(this.title + "\n");
        if(visitor instanceof LevelViewer)
            ((LevelViewer)visitor).setScenarioText(this.title + "\n");
        int counter = 1;
        for(Step step : steps)
        {
            step.acceptDisplaying(visitor, String.valueOf(counter) + ".", 0);
            counter++;
        }
    }

    public Scenario() { }

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getActors() { return actors; }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getSystemActors() {
        return system_actors;
    }

    public void setSystemActors(List<String> system_actors) {
        this.system_actors = system_actors;
    }

    public List<Step> getSteps() { return steps; }

    public void setSteps(List<Step> steps) { this.steps = steps; }

}