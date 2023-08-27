package com.justlym.dataStructure.sort;

public class SmallSum {

    public void smallSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        System.out.println(process(arr, 0, arr.length - 1));
    }

    private int process(int[] arr, int l, int r) {
        if (r == l) {
            return 0;
        }
        int mid  = l + ((r - l) >> 1);
        return process(arr, l, mid) + process(arr, mid + 1, r)
                + merge(arr, l, mid, r);
    }

    private int merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int smallSum = 0;
        int lp = l;
        int rp = mid + 1;
        while (lp <= mid && rp <= r) {
            // 左边的比右边小 产生小和
            smallSum += arr[lp] <= arr[rp] ? (r - rp + 1) * arr[lp]: 0;
            help[i++] = arr[lp] <= arr[rp] ? arr[lp++] : arr[rp++];
        }
        while (lp <= mid) {
            help[i++] = arr[lp++];
        }
        while (rp <= r) {
            help[i++] = arr[rp++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[l + j] = help[j];
        }
        return smallSum;
    }
}
