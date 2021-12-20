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

public class Step {
    private Integer stepNumber;
    private String actor;
    private List<String> content;
    private List<Step> substeps;
    private List<Integer> returnPath;

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
