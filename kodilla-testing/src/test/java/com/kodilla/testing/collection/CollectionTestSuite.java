package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.*;

    @DisplayName("Collection Test Suite")
    class CollectionTestSuite {

        @BeforeEach
        public void before() {
            System.out.println("Test Case: begin");
        }

        @AfterEach
        public void after() {
            System.out.println("Test Case: end");
        }

        @BeforeAll
        public static void beforeAll() {
            System.out.println("Test Suite: begin");
        }

        @AfterAll
        public static void afterAll() {
            System.out.println("Test Suite: end");
        }
        @DisplayName(
                "When we send collection1" +
                "the exterminate method should return empty list"
        )
        @Test
        void testOddNumbersExterminatorEmptyList() {
            //Given
            Integer collection[] = new Integer[] { 3, 5, 7, 9 };
            OddNumbersExterminator exterminator = new OddNumbersExterminator();
            //When
            List result = exterminator.exterminate(Arrays.asList(collection));
            System.out.println("Testing " + result);
            //Then
            int expected1 = 0;
            int actual1 = result.size();
            Assertions.assertEquals(expected1, actual1);
        }
        @DisplayName(
          "When we send collection2" +
          "the exterminate method should return two integers"
        )

        @Test
        void testOddNumbersExterminatorNormalList() {
            //Given
            Integer collection2[] = new Integer[] { 2, 3, 6, 9 };
            OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
            //When
            List result2 = exterminator2.exterminate(Arrays.asList(collection2));
            System.out.println("Testing " + result2);
            //Then
            int expected2 = 2;
            int actual2 = result2.size();
            Assertions.assertEquals(expected2, actual2);
        }

    }

