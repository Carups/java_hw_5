package ru.spbau.mit;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.fail;
import static ru.spbau.mit.SecondPartTasks.*;

public class SecondPartTasksTest {

    @Test
    public void testFindQuotes() throws IOException {
        List<String> result = findQuotes(Arrays.asList("a",
                "b", "c"), "a");
        Assert.assertEquals(Arrays.asList("aa",
                "a b c", "a b c", "c a", "a b c"),
                result);
    }

    @Test
    public void testPiDividedBy4() {

        Assert.assertEquals(Math.PI / 4, piDividedBy4(), 1e-3);
    }

    @Test
    public void testFindPrinter() {
        Map<String, List<String>> tmp = new HashMap<>();
        tmp.put("A", Arrays.asList("a", "b", "c"));
        tmp.put("B", Arrays.asList("aa", "b", "c"));
        Assert.assertEquals("B", findPrinter(tmp));
    }

    @Test
    public void testCalculateGlobalOrder() {
        Map<String, Integer> first = new HashMap<>();
        first.put("a", 1);
        first.put("b", 2);

        Map<String, Integer> second = new HashMap<>();
        second.put("b", 3);
        second.put("c", 4);

        Map<String, Integer> myRes = new HashMap<>();
        myRes.put("a", 1);
        myRes.put("b", 5);
        myRes.put("c", 4);

        Map<String, Integer> res = calculateGlobalOrder(Arrays.asList(first, second));
        Assert.assertEquals(myRes, res);
    }
}