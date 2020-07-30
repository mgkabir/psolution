package io.kabir.leetcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NumberProblemsTest {

    NumberProblems nProbs;

    @BeforeEach
    void setUp() {
        nProbs = new NumberProblems();
    }

    @AfterEach
    void tearDown() {
        nProbs = null;
    }

    @Test
    void threeSum() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<Integer> list1 = Arrays.asList(-1, 0, 1);
        List<Integer> list2 = Arrays.asList(-1, -1, 2);

        List<List<Integer>> output = new ArrayList();
        output.add(list1);
        output.add(list2);

        assertEquals(output.size(), nProbs.threeSum(input).size());
        //assertEquals(output, nProbs.threeSum(input));
    }
    @Test
    void threeSumMore() {
        int[] input = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<Integer> list1 = Arrays.asList(-4,-2,6);
        List<Integer> list2 = Arrays.asList(-4,0,4);
        List<Integer> list3 = Arrays.asList(-4,1,3);
        List<Integer> list4 = Arrays.asList(-4,2,2);
        List<Integer> list5 = Arrays.asList(-2,-2,4);
        List<Integer> list6 = Arrays.asList(-2,0,2);

        // [[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
        List<List<Integer>> output = new ArrayList();
        output.add(list1);
        output.add(list2);
        output.add(list3);
        output.add(list4);
        output.add(list5);
        output.add(list6);

        assertEquals(output.size(), nProbs.threeSum(input).size());
        //assertEquals(output, nProbs.threeSum(input));
    }
}