package com.justlym.dataStructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {1,4,3,7,8};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
