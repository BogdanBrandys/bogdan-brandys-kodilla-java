package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {
    @Test
    public void testProbablyIWillThrowException() {
        // given
        ExceptionHandling exception = new ExceptionHandling();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> exception.probablyIWillThrowException(1.0, 1.5)),
                () -> assertThrows(Exception.class, () -> exception.probablyIWillThrowException(0.0, 1.5)),
                () -> assertDoesNotThrow(() -> exception.probablyIWillThrowException(1.0, 2.0))
        );
}
}
