package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.logic.visitor.CountActors;
import pl.put.poznan.scenario.model.Step;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CountActorsTest {

    @Test
    void count_1()
    {
        Step mockObject = mock(Step.class);
        when(mockObject.getActor()).thenReturn("Bibliotekarz");
        CountActors testedObject = new CountActors();

        testedObject.count(mockObject);
        assertEquals(testedObject.getNumberOfSystemActors(), 0);
        assertEquals(testedObject.getNumberOfActors(), 1);

    }

    @Test
    void count_2()
    {
        Step mockObject = mock(Step.class);
        when(mockObject.getActor()).thenReturn("System");
        CountActors testedObject = new CountActors();

        testedObject.count(mockObject);
        assertEquals(testedObject.getNumberOfSystemActors(), 1);
        assertEquals(testedObject.getNumberOfActors(), 0);

    }
}