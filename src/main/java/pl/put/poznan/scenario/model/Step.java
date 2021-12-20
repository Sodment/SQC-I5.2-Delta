package pl.put.poznan.scenario.model;

import pl.put.poznan.scenario.logic.visitor.Visitor;

import java.util.List;

/**
 * Klasa reprezentuje pojedynczy krok w scenariuszu
 */
public class Step {
    private Integer stepNumber;
    private String actor;
    private List<String> content;
    private List<Step> substeps;
    private List<Integer> returnPath;

    public void acceptCounting(Visitor visitor)
    {
        visitor.count(this);
        if(!this.substeps.isEmpty())
        {
            for(Step step : substeps) { step.acceptCounting(visitor); }
        }
    }

    public Step() {
    }

    public Integer getStepNumber() {
        return stepNumber;
    }

    public String getActor() {
        return actor;
    }

    public List<String> getContent() {
        return content;
    }

    public List<Step> getSubsteps() {
        return substeps;
    }

    public List<Integer> getReturnPath() {
        return returnPath;
    }

    public void setStepNumber(Integer stepNumber) {
        this.stepNumber = stepNumber;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public void setSubsteps(List<Step> substeps) {
        this.substeps = substeps;
    }

    public void setReturnPath(List<Integer> returnPath) {
        this.returnPath = returnPath;
    }
}
