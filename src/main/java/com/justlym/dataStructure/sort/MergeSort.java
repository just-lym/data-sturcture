package com.justlym.dataStructure.sort;

public class MergeSort {

    /**
     * 归并排序，N*logN的时间复杂度
     * @param arr
     */
    public void mergeSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    private void process(int[] arr, int l, int r) {
        if (r == l) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        process(arr, l, mid);
        process(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int lp = l;
        int rp = mid + 1;
        while (rp <= r && lp <= mid) {
            help[i++] = arr[rp] <= arr[lp] ? arr[rp++] : arr[lp++];
        }

        while (rp <= r) {
            help[i++] = arr[rp++];
        }
        while (lp <= mid) {
            help[i++] = arr[lp++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[l + j] = help[j];
        }
    }
}
