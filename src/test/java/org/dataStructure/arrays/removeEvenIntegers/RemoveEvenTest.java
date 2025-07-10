package org.dataStructure.arrays.removeEvenIntegers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class RemoveEvenTest {
    private static final Logger LOGGER = Logger.getLogger(RemoveEvenTest.class.getName());

    @BeforeAll
    static void setup() {
        LOGGER.info("RemoveEvenTest Start");
    }

    @Test
    void removeEven() {
        int[] inputArray = {1, 2, 4, 5, 10, 6, 3};
        int[] expectedArray = {1, 5, 3};

        int[] res = RemoveEven.removeEven(inputArray);
        assertArrayEquals(expectedArray, res);
    }
}