package pl.put.poznan.scenario.logic;

import com.google.gson.Gson;
import pl.put.poznan.scenario.model.Scenario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Odpowiada za zapis danych do pliku JSON.
 *
 */
public class JSONWrite {

    final static  String path = "src/main/resources/";

    /**
     * Zapisuje dane do pliku JSON.
     *
     * @param scenario nazwa scenariusza
     * @param name nazwa pliku
     */
    public static String writeScenarioToFile(Scenario scenario, String name)
    {
        Gson gson = new Gson();
        String jString = gson.toJson(scenario);
        String filename = path + name + ".json";
        File file = new File(filename);

        try{
            FileWriter writer = new FileWriter(file);
            writer.write(jString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return "Nie udalo zapisac sie scenariusza do pliku!";
        }
        return "Scenariusz zapisany do pliku!";
    }
}
