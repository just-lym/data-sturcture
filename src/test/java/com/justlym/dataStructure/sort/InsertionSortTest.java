package com.justlym.dataStructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] arr = {1,4,3,7,8};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
