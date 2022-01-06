package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

public class ScenarioViewer extends DisplayingVisitor{

    private String scenarioText = "";

    public String getScenarioText() { return scenarioText; }

    public void setScenarioText(String scenarioText) { this.scenarioText = scenarioText; }

    @Override
    public void display(Step step, String parentNum, int level)
    {
        for(int i=0; i<level; i++)
            scenarioText += "- - " + step.getStepNum();
        scenarioText += parentNum + " ";
        for(int i=0; i < step.getContent().size(); i++)
            scenarioText += step.getContent().get(i) + " ";
        scenarioText = scenarioText.replaceAll("<[^>]*>", "");
        scenarioText = scenarioText.replaceAll("null.", "");
        System.out.println(scenarioText);
    }
}
