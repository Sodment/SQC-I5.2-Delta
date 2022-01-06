package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

public class LevelViewer extends DisplayingVisitor{
    private String scenarioText = "";
    private int desiredLevel = 0;

    public LevelViewer(int desiredLevel) { this.desiredLevel = desiredLevel; }

    public String getScenarioText() { return scenarioText; }

    public void setScenarioText(String scenarioText) { this.scenarioText = scenarioText; }

    public int getDesiredLevel() { return desiredLevel; }

    public void setDesiredLevel(int desiredLevel) { this.desiredLevel = desiredLevel; }

    @Override
    public void display(Step step, String parentNum, int level)
    {
        if(level < desiredLevel) {
            for (int i = 0; i < level; i++)
                scenarioText += "- - ";
            scenarioText += parentNum + " ";
            for (int i = 0; i < step.getContent().size(); i++)
                scenarioText += step.getContent().get(i) + "\n ";
            scenarioText = scenarioText.replaceAll("<[^>]*>", "");
            scenarioText = scenarioText.replaceAll("null.", "");
        }
    }
}
