package com.justlym.dataStructure.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: justLym
 * 2023/08/30 19:43
 */
public class HeapSortTest {

    @Test
    public void testHeapSort() {
        int[] arr = {1,4,3,7,8};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
