package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] array = new int[]{4,2,8,4,5,12,7,5,9,10};
        //When
        double actual = ArrayOperations.getAverage(array);
        double expected = 6.6;
        //Then
        Assertions.assertEquals(expected, actual);
    }
}
