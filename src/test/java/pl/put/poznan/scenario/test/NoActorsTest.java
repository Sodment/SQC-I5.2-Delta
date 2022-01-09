package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import pl.put.poznan.scenario.logic.visitor.NoActors;
import pl.put.poznan.scenario.model.Step;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoActorsTest
{

    @Test
    void isActor_1() {
        Step mockObject = mock(Step.class);
        when(mockObject.getActor()).thenReturn("Bibliotekarz");
        NoActors testedObject = new NoActors();

        assertTrue(testedObject.isActor(mockObject));
    }

    @Test
    void isActor_2() {
        Step mockObject = mock(Step.class);
        when(mockObject.getActor()).thenReturn("");
        NoActors testedObject = new NoActors();

        assertTrue(!testedObject.isActor(mockObject));
    }
}