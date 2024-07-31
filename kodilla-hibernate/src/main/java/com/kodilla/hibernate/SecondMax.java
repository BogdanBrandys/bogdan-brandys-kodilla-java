package com.kodilla.hibernate;

import java.util.ArrayList;
import java.util.List;

public class SecondMax {
    public int findSecondMax(List<Integer> list) {
        int max = list.get(0);
        int secondMax = 0;
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
                for (int j = i + 1; j < list.size(); j++) {
                    if ((secondMax < list.get(j)) && (list.get(j) < max)) {
                        secondMax = list.get(j);
                    }
                }

            }
        }
        return secondMax;
    }
    public int findSecondMin(List<Integer> list) {
        int min = list.get(0);
        int secondMin = list.get(0);
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
                for (int j = i + 1; j < list.size(); j++) {
                    if ((secondMin > list.get(j)) && (list.get(j) > min)) {
                        secondMin = list.get(j);
                    }
                }

            }
        }
        return secondMin;
    }
}
