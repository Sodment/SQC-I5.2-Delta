package pl.put.poznan.scenario.logic;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Odpowiada za odczyt danych z pliku JSON.
 *
 */
public class JSONRead
{
    /**
     * Odpowiada za pobranie pliku z folderu 'resources'.
     * @param filename nazwa pliku
     * @return odpowiedni obiekt JSON z folderu 'resources'
     */
    private File getFileFromResources(String filename)
    {
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(filename);
        if (resource == null) {
            throw new IllegalArgumentException("File is not found!");
        } else {
            return new File(resource.getFile());
        }
    }

    /**
     * Transformuje plik JSON do obiektu typu String.
     *
     * @param filename nazwa pliku
     * @return powstały z pliku JSON obiekt String
     */
    public String toString(String filename)
    {
        String filepath = getFileFromResources(filename + ".json").getPath();
        String content = "";
        try {
            content = new String ( Files.readAllBytes( Paths.get(filepath) ) );
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
