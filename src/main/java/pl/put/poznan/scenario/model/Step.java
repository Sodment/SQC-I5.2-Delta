package pl.put.poznan.scenario.model;

import java.util.List;


/**
 * Class to store scenario steps
 */
public class Step {
    private Integer stepNum;
    private String actor;
    private List<String> contentList;

    public Step() { }

    public Integer getStepNum() { return stepNum; }

    public void setStepNum(Integer stepNum) { this.stepNum = stepNum; }

    public String getActor() { return actor; }

    public void setActor(String actor) { this.actor = actor; }

    public List<String> getContent() { return contentList; }

    public void setContent(List<String> contentList) { this.contentList = contentList; }
}
