package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.model.Step;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class StepTest {

    private Step step = null;

    @BeforeEach
    void setUp() {
        step = new Step();
        step.setStepNum(1);
        step.setActor("Bibliotekarz");
        step.setContent(List.of("Biblitekarz odkłada książkę"));
        step.setSubsteps(List.of());
        step.setReturnPath(List.of());
    }

    @AfterEach
    void tearDown() {
        step = null;
    }

    @Test
    void getStepNum() {
        assertEquals(step.getStepNum(), 1);
    }

    @Test
    void setStepNum() {
        step.setStepNum(2);
        assertEquals(step.getStepNum(), 2);
    }

    @Test
    void getActor() {
        assertEquals(step.getActor(), "Bibliotekarz");
    }

    @Test
    void setActor() {
        step.setActor("System");
        assertEquals(step.getActor(), "System");
    }

    @Test
    void getContent() {
        assertEquals(step.getContent(), List.of("Biblitekarz odkłada książkę"));
    }

    @Test
    void setContent() {
        step.setContent(List.of("System uruchamia apliakcję"));
        assertEquals(step.getContent(), List.of("System uruchamia apliakcję"));
    }

    @Test
    void getSubsteps() {
        assertEquals(step.getSubsteps(), List.of());
    }

    @Test
    void setSubsteps() {
        Step step1 = new Step();
        Step step2 = new Step();
        step.setSubsteps(List.of(step1, step2));
        assertEquals(step.getSubsteps(), List.of(step1, step2));
    }

    @Test
    void getReturnPath() {
        assertEquals(step.getReturnPath(), List.of());
    }

    @Test
    void setReturnPath() {
        step.setReturnPath(List.of(3, 2, 1));
        assertEquals(step.getReturnPath(), List.of(3, 2, 1));
    }
}