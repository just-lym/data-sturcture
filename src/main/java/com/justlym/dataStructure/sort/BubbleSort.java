package com.justlym.dataStructure.sort;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(int[] arr, int j, int next) {
       arr[j] = arr[j] ^ arr[next];
       arr[next] = arr[j] ^ arr[next];
       arr[j] = arr[j] ^ arr[next];
    }
}
