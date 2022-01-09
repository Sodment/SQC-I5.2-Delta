package pl.put.poznan.scenario.test;

import org.junit.jupiter.api.Test;
import pl.put.poznan.scenario.logic.JSONRead;

import static org.junit.jupiter.api.Assertions.*;

class JSONReadTest {

    @Test
    void testToString() {
        JSONRead testedObject = new JSONRead();
        assertThrows(IllegalArgumentException.class, () -> testedObject.toString("test"));
    }
}