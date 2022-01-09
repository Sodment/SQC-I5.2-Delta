package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.logic.visitor.CountActors;
import pl.put.poznan.scenario.logic.visitor.KeyWords;
import pl.put.poznan.scenario.model.Step;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class KeyWordsTest
{

    @Test
    void isKeyWord()
    {
        Step mockObject = mock(Step.class);
        when(mockObject.getContent()).thenReturn(List.of("IF"));

        KeyWords testedObject = new KeyWords();
        assertTrue(testedObject.isKeyWord(mockObject));
    }

    @Test
    void count_1()
    {
        Step mockObject = mock(Step.class);
        when(mockObject.getContent()).thenReturn(List.of("IF"));
        KeyWords testedObject = new KeyWords();

        testedObject.count(mockObject);
        assertEquals(testedObject.getStepsCount(), 1);
    }

    @Test
    void count_2()
    {
        Step mockObject = mock(Step.class);
        when(mockObject.getContent()).thenReturn(List.of("FOR EACH"));
        KeyWords testedObject = new KeyWords();

        testedObject.count(mockObject);
        assertEquals(testedObject.getStepsCount(), 1);
    }

    @Test
    void count_3()
    {
        Step mockObject = mock(Step.class);
        when(mockObject.getContent()).thenReturn(List.of("for"));
        KeyWords testedObject = new KeyWords();

        testedObject.count(mockObject);
        assertEquals(testedObject.getStepsCount(), 0);
    }
}