package pl.put.poznan.scenario.model;

import java.util.List;


/**
 * Klasa reprezentuje pojedynczy krok w scenariuszu
 */
public class Step {
    private Integer stepNum;
    private String actor;
    private List<String> contentList;
    private List<Integer> returnPath;

    public Step() { }

    public Integer getStepNum() { return stepNum; }

    public void setStepNum(Integer stepNum) { this.stepNum = stepNum; }

    public String getActor() { return actor; }

    public void setActor(String actor) { this.actor = actor; }

    public List<String> getContent() { return contentList; }

    public void setContent(List<String> contentList) { this.contentList = contentList; }

    public List<Integer> getReturnPath() { return returnPath; }

    public void setReturnPath(List<Integer> returnPath) { this.returnPath = returnPath; }

}
