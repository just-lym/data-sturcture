package com.justlym.dataStructure.sort;

import org.junit.Test;

import java.util.Arrays;

public class SelectSortTest {

    @Test
    public void testSelectSort() {
        int[] arr = {1,4,3,7,8};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
