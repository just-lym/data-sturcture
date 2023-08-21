package com.justlym.dataStructure.sort;

import org.junit.Test;

public class PrintOddTimeNumTest {

    @Test
    public void testPrintOddNum() {
        int[] arr = {1,1,3,3,44,5,5};
        PrintOddTimesNum printOddTimesNum = new PrintOddTimesNum();
        printOddTimesNum.printOddTimesNum(arr);
    }

    @Test
    public void testPrintOddNum2() {
        int[] arr = {1,3,3,5,5,6};
        PrintOddTimesNum printOddTimesNum = new PrintOddTimesNum();
        printOddTimesNum.printOddTimesNum2(arr);
    }
}
