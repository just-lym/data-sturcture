package com.justlym.dataStructure.sort;

import com.justlym.dataStructure.recursion.GetMax;
import org.junit.Test;

public class GetMaxTest {

    @Test
    public void testGetMax() {
        int[] arr = {1,4,3,7,8};
        GetMax getMax = new GetMax();
        getMax.getMax(arr);
    }
}
