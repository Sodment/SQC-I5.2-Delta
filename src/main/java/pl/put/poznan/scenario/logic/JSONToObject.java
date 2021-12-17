package pl.put.poznan.scenario.logic;

import com.google.gson.Gson;
import pl.put.poznan.scenario.model.Scenario;

public class JSONToObject {
        public static Scenario getObject(String scenarioJSON)
        {
            Gson gson = new Gson();
            return gson.fromJson(scenarioJSON, Scenario.class);
        }
}
