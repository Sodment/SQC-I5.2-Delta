package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.logic.visitor.ScenarioViewer;
import pl.put.poznan.scenario.model.Step;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ScenarioViewerTest {

    @Test
    void display() {
        Step mockObject = mock(Step.class);
        when(mockObject.getContent()).thenReturn(List.of("IF"));
        ScenarioViewer testedObject = new ScenarioViewer();

        testedObject.display(mockObject, "1", 1);
        assertEquals(testedObject.getScenarioText(), "- - 01 IF ");
    }
}