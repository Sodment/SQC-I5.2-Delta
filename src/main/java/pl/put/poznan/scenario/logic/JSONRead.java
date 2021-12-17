package pl.put.poznan.scenario.logic;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class JSONRead {

    private final String[] transforms;

    public JSONRead(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String text){
        // of course, normally it would do something based on the transforms
        return text.toUpperCase();
    }
}
