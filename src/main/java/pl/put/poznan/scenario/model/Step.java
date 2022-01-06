package pl.put.poznan.scenario.model;

import pl.put.poznan.scenario.logic.visitor.CountingVisitor;
import pl.put.poznan.scenario.logic.visitor.DisplayingVisitor;

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

    public void acceptCounting(CountingVisitor countingVisitor)
    {
        countingVisitor.count(this);
        if(!this.substeps.isEmpty())
        {
            for(Step step : substeps) { step.acceptCounting(countingVisitor); }
        }
    }

    public void acceptDisplaying(DisplayingVisitor visitor, String num, int level)
    {
        int counter;
        visitor.display(this, num, level);
        if(!this.substeps.isEmpty()) {
            level++;
            counter = 0;
            for (Step step : substeps) {
                step.acceptDisplaying(visitor, num + String.valueOf(counter), level);
                counter++;
            }
        }
    }


    public Step() { }

    public Integer getStepNum() { return stepNumber; }

    public void setStepNum(Integer stepNum) { this.stepNumber = stepNum; }
  
    public String getActor() { return actor; }
  
    public void setActor(String actor) { this.actor = actor; }
  
    public List<String> getContent() { return content; }

    public void setContent(List<String> contentList) { this.content = contentList; }

    public List<Step> getSubsteps() { return substeps; }
  
    public void setSubsteps(List<Step> substeps) { this.substeps = substeps; }

    public List<Integer> getReturnPath() { return returnPath; }
  
    public void setReturnPath(List<Integer> returnPath) { this.returnPath = returnPath; }

    
}