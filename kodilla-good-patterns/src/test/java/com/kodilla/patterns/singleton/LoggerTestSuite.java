package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        logger = Logger.LOG;
        //When
        logger.log("This is testing log");
        //Then
        assertEquals("This is testing log", logger.getLastLog());
    }

    }