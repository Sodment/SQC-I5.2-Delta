package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

/**
 * Wyświetla listę kroków z uwzględnieniem numeru kroku i zagłębienia.
 * Dziedziczy po abstrakcyjnej klasie implementując wzorzec projektowy 'wizytator'.
 */
public class LevelViewer extends DisplayingVisitor{
    private String scenarioText = "";
    private int desiredLevel = 0;

    public LevelViewer(int desiredLevel) { this.desiredLevel = desiredLevel; }

    public String getScenarioText() { return scenarioText; }

    public void setScenarioText(String scenarioText) { this.scenarioText = scenarioText; }

    public int getDesiredLevel() { return desiredLevel; }

    public void setDesiredLevel(int desiredLevel) { this.desiredLevel = desiredLevel; }

    /**
     * Wyświetla krok z uwzględnieniem numeru kroku i zagłębienia.
     *
     * @param step Obecnie rozpatrywany krok
     * @param parentNum numer kroku nadrzędnego
     * @param level poziom zagłębienia kroku
     */
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
