package com.justlym.dataStructure.sort;

public class SelectSort {

    public void selectSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    public void swap(int[] arr, int i, int next) {
        arr[i] = arr[i] ^ arr[next];
        arr[next] = arr[i] ^ arr[next];
        arr[i] = arr[i] ^ arr[next];
    }
}
