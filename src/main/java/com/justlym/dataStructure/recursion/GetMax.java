package com.justlym.dataStructure.recursion;

public class GetMax {

    /**
     * master时间复杂度 T(N) = a * T(N/b) + O(N^d)
     * log(b,a) > d 复杂度为O(N^log(b,a))
     * log(b,a) == d 复杂度为O(N^b * logN)
     * log(b,a) < d 复杂度为O(N^d)
     * @param arr
     */
    public void getMax(int[] arr) {
        System.out.println(process(arr, 0, arr.length - 1));
    }

    private int process(int[] arr, int r, int l) {
        if (r == l) {
            return arr[r];
        }
        int middle = l + ((r - l) >> 1);
        int rightMax = process(arr, middle + 1, r);
        int leftMax = process(arr, l, middle);
        return Math.max(rightMax, leftMax);
    }
}
