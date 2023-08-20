package com.justlym.dataStructure.sort;

public class InsertionSort {

    public void insertionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] < arr[j + 1] ; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public void swap(int[] arr, int i, int next) {
        arr[i] = arr[i] ^ arr[next];
        arr[next] = arr[i] ^ arr[next];
        arr[i] = arr[i] ^ arr[next];
    }
}
