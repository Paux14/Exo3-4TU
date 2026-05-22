package org.exampleTest;

import java.util.Arrays;
import java.util.List;

import org.example.Fib;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FibTest {

    @Test
    void getFibSeries_range1_resultIsNotEmpty() {
        Fib fib = new Fib(1);

        List<Integer> result = fib.getFibSeries();

        assertFalse(result.isEmpty());
    }

    @Test
    void getFibSeries_range1_resultIsZero() {
        Fib fib = new Fib(1);

        List<Integer> result = fib.getFibSeries();

        assertEquals(List.of(0), result);
    }

    @Test
    void getFibSeries_range6_containsThree() {
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        assertTrue(result.contains(3));
    }

    @Test
    void getFibSeries_range6_hasSixElements() {
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        assertEquals(6, result.size());
    }

    @Test
    void getFibSeries_range6_doesNotContainFour() {
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        assertFalse(result.contains(4));
    }

    @Test
    void getFibSeries_range6_matchesExpectedSeries() {
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), result);
    }

    @Test
    void getFibSeries_range6_isSortedAscending() {
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();

        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i) <= result.get(i + 1));
        }
    }
}
