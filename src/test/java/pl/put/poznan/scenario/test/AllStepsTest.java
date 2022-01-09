package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.logic.visitor.AllSteps;
import pl.put.poznan.scenario.logic.visitor.KeyWords;
import pl.put.poznan.scenario.model.Step;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AllStepsTest
{

    @Test
    void count()
    {
        Step mockObject = mock(Step.class);
        AllSteps testedObject = new AllSteps();

        testedObject.count(mockObject);
        assertEquals(testedObject.getStepsCount(), 1);
    }
}