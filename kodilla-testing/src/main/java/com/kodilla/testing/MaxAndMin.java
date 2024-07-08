package com.kodilla.testing;

import java.util.List;

public class MaxAndMin {

    public int MaxAndMin(List<Integer> array, MaxOrMin whichValue) {
        int max = 0;
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            }
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        if (whichValue.val.equals("MAX")) {
            return max;
        }
         else if (whichValue.val.equals("MIN")) {
            return min;
        }
        return max;
    }
}

