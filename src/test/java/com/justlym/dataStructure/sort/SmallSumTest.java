package com.justlym.dataStructure.sort;

import org.junit.Test;

/**
 * @author: justLym
 * 2023/08/27 19:31
 */
public class SmallSumTest {

    @Test
    public void testSmallSum() {
        int[] arr = {1,3,4,2,5};
        SmallSum smallSum = new SmallSum();
        smallSum.smallSum(arr);
    }
}
