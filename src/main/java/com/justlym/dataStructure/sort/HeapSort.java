package com.justlym.dataStructure.sort;

/**
 * @author: justLym
 * 2023/08/27 21:40
 */
public class HeapSort {


    /**
     * 依据完全二叉树的特性，将数组调整为大根堆
     * 位置i的左节点：2 * i + 1
     * 位置i的右节点：2 * i + 2
     * 位置i的父节点：(i - 1) / 2
     * @param arr
     */
    public void heapSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        // 整个数组成为大根堆
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0 ,heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    /**
     * 如果父节点比当前位置小，从当前位置往上交换
     * @param arr
     * @param i
     */
    private void heapInsert(int[] arr, int i) {
        int index = (i - 1) / 2;
        while (arr[i] > arr[index]) {
            swap(arr, index, i);
            i = index;
            index = (i - 1) / 2;
        }
    }

    /**
     * 从当前位置往下交换
     * @param arr
     * @param index
     * @param heapSize
     */
    private void heapify(int[] arr, int index, int heapSize) {
        int left = 2 * index + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left] < arr[left + 1] ? left + 1 : left;
            if (arr[index] >= arr[largest]) {
                break;
            }
            swap(arr, index, largest);
            index = largest;
            left = 2 * index + 1;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }
}
