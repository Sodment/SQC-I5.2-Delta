package pl.put.poznan.scenario.logic;

import com.google.gson.Gson;
import pl.put.poznan.scenario.model.Scenario;

/**
 * Odpowiada za przekształcenie scenariusza w formie obiektu typu String do obiektu typu Scenario.
 *
 */
public class JSONToObject {
    /**
     * @param scenarioJSON scenariusz
     * @return obiekt typu Scenario
     */
        public static Scenario getObject(String scenarioJSON)
        {
            Gson gson = new Gson();
            return gson.fromJson(scenarioJSON, Scenario.class);
        }
}
