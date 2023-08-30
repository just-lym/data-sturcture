package com.justlym.dataStructure.sort;

import java.util.PriorityQueue;

/**
 * @author: justLym
 * 2023/08/30 17:30
 */
public class RangeHeapSort {

    public void rangeHeapSort(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]);
        }
        int i = 0;
        for (int j = k; j < arr.length - 1; j++) {
            queue.offer(arr[j]);
            arr[i++] = queue.poll();
        }
        while (!queue.isEmpty()) {
            arr[i++] = queue.poll();
        }
    }
}
