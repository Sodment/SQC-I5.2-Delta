package pl.put.poznan.scenario.logic.visitor;

import pl.put.poznan.scenario.model.Step;

import java.util.List;

public class KeyWords extends Visitor {
    private long stepsCount = 0;

    public long getStepsCount() {
        return stepsCount;
    }

    @Override
    public void count(Step step) {
        if(isKeyWord(step)) {
            stepsCount++;
        }
    }

    private static boolean isKeyWord(Step step) {
        List<String> text = step.getContent();
        return text.get(0).equals("IF") || text.get(0).equals("FOR EACH") || text.get(0).equals("ELSE");
    }
}
