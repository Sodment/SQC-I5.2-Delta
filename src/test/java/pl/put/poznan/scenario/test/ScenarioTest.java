package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.model.Scenario;
import pl.put.poznan.scenario.model.Step;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScenarioTest {

    private Scenario scenario = null;

    @BeforeEach
    void setUp() {
        scenario = new Scenario();
        scenario.setTitle("Zapłacenie za produkt");
        scenario.setActors(List.of("Klient"));
        scenario.setSystemActors(List.of("System"));
        scenario.setSteps(List.of());
    }

    @AfterEach
    void tearDown() {
        scenario = null;
    }

    @Test
    void getTitle() {
        assertEquals(scenario.getTitle(), "Zapłacenie za produkt");
    }

    @Test
    void setTitle() {
        scenario.setTitle("Tytuł");
        assertEquals(scenario.getTitle(), "Tytuł");
    }

    @Test
    void getActors() {
        assertEquals(scenario.getActors(), List.of("Klient"));
    }

    @Test
    void setActors() {
        scenario.setActors(List.of("Aktor"));
        assertEquals(scenario.getActors(), List.of("Aktor"));
    }

    @Test
    void getSystemActors() {
        assertEquals(scenario.getSystemActors(), List.of("System"));
    }

    @Test
    void setSystemActors() {
        scenario.setSystemActors(List.of("Aktor systemowy"));
        assertEquals(scenario.getSystemActors(), List.of("Aktor systemowy"));
    }

    @Test
    void getSteps() {
        assertEquals(scenario.getSteps(), List.of());
    }

    @Test
    void setSteps() {
        Step step1 = new Step();
        Step step2 = new Step();
        scenario.setSteps(List.of(step1, step2));
        assertEquals(scenario.getSteps(), List.of(step1, step2));
    }
}