package pl.put.poznan.scenario.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.google.gson.JsonSyntaxException;
import pl.put.poznan.scenario.logic.visitor.*;
import pl.put.poznan.scenario.model.*;
import pl.put.poznan.scenario.logic.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class ScenarioQualityCheckerController {

    @RequestMapping(method = RequestMethod.GET, path = "/all-steps/{filename}")
    public long countAllSteps(@PathVariable String filename)
    {
        System.out.println(filename);
        String json = new JSONRead().toString(filename);

        if(json.equals("{}") || json.equals(""))
            return 0;

        Scenario scenario;
        try {
            scenario = JSONToObject.getObject(json);
        }
        catch (JsonSyntaxException e) {
            return 0;
        }

        AllSteps visitor = new AllSteps();
        scenario.acceptCounting(visitor);
        long result = visitor.getStepsCount();
        visitor.setStepsCount(0);
        return result;
    }
  
    @RequestMapping(method = RequestMethod.GET, path = "/key-words/{filename}")
    public long countKeyWords(@PathVariable String filename)
    {
        String json = new JSONRead().toString(filename);

        if(json.equals("{}") || json.equals(""))
            return 0;

        Scenario scenario;
        try {
            scenario = JSONToObject.getObject(json);
        }
        catch (JsonSyntaxException e) {
            return 0;
        }

        KeyWords visitor = new KeyWords();
        scenario.acceptCounting(visitor);
        long result = visitor.getStepsCount();
        visitor.setStepsCount(0);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/no-actors/{filename}")
    public List<String> countNoActors(@PathVariable String filename)
    {
        String json = new JSONRead().toString(filename);

        if(json.equals("{}") || json.equals(""))
            return Collections.emptyList();

        Scenario scenario;
        try {
            scenario = JSONToObject.getObject(json);
        }
        catch (JsonSyntaxException e) {
            return Collections.emptyList();
        }

        NoActors visitor = new NoActors();
        scenario.acceptCounting(visitor);
        ArrayList<String> result = visitor.getStepsWithoutActors();
        visitor.setStepsCount(new ArrayList<String>());
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/count-actors/{filename}")
    public String countActors(@PathVariable String filename)
    {
        String json = new JSONRead().toString(filename);

        if(json.equals("{}") || json.equals(""))
            return "";

        Scenario scenario;
        try {
            scenario = JSONToObject.getObject(json);
        }
        catch (JsonSyntaxException e) {
            return "";
        }

        CountActors visitor = new CountActors();
        scenario.acceptCounting(visitor);
        String result = visitor.getActors();
        visitor.setNumberOfActors(0);
        visitor.setNumberOfSystemActors(0);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/show-scenario/{level}/{filename}")
    public String showLevelScenario(@PathVariable String filename, @PathVariable int level)
    {
        String json = new JSONRead().toString(filename);

        Scenario scenario;
        try {
            scenario = JSONToObject.getObject(json);
        }
        catch (JsonSyntaxException e) {
            return "Błędna struktura scenariusza.";
        }

        LevelViewer visitor = new LevelViewer(level);
        scenario.acceptDisplaying(visitor);
        String result = visitor.getScenarioText();
        visitor.setScenarioText("");
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/show-scenario/{filename}")
    public String showScenario(@PathVariable String filename)
    {
        String json = new JSONRead().toString(filename);

        Scenario scenario;
        try {
            scenario = JSONToObject.getObject(json);
        }
        catch (JsonSyntaxException e) {
            return "Błędna struktura scenariusza.";
        }

        ScenarioViewer visitor = new ScenarioViewer();
        scenario.acceptDisplaying(visitor);
        String result = visitor.getScenarioText();
        visitor.setScenarioText("");
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/save-scenario/{title}")
    public String saveScenario(@PathVariable String title, @RequestBody Scenario scenario)
    {
        return JSONWrite.writeScenarioToFile(scenario, title);
    }

}