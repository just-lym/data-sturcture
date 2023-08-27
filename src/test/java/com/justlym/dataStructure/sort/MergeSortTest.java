package com.justlym.dataStructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMerge() {
        int[] arr = {1,4,3,7,8};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
