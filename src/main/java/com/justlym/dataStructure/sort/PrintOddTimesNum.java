package com.justlym.dataStructure.sort;

public class PrintOddTimesNum {

    public void printOddTimesNum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int eor = 0;
        for (int j : arr) {
            eor ^= j;
        }
        System.out.println(eor);
    }

    public void printOddTimesNum2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int eor = 0;
        for (int j : arr) {
            eor ^= j;
        }
        int rightOne = eor & (~eor + 1);
        int onlyOne = 0;
        for (int i : arr) {
            if ((i & rightOne) == 0) {
                onlyOne ^= i;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }
}
