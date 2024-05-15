package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {
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

    @Nested
    @DisplayName("Tests for methods changing quantity of elements in collector")
    class TestsChangers {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector testShape1 = new ShapeCollector();
            //When
            testShape1.addFigure(new Triangle("triangle 1", 4, 3, 5));
            //Then
            Assertions.assertEquals("triangle 1", testShape1.getFigure(0).getShapeName());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector testShape2 = new ShapeCollector();
            //When
            Square square1 = new Square("square 1", 5);
            testShape2.addFigure(square1);
            boolean result = testShape2.removeFigure(square1);
            //Then
            Assertions.assertTrue(result);
        }
    }

    @Nested
    @DisplayName("Tests for methods showing elements in collector")
    class TestsShowingElements {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector testShape3 = new ShapeCollector();
            //When
            Circle circle1 = new Circle("circle 1", 5);
            testShape3.addFigure(circle1);
            //Then
            Assertions.assertEquals((Circle) circle1, testShape3.getFigure(0));
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector testShape4 = new ShapeCollector();
            //When
            Circle circle2 = new Circle("circle 2", 6);
            Square square2 = new Square("square 2", 2);
            Triangle triangle2 = new Triangle("triangle 2", 6, 6, 6);
            testShape4.addFigure(circle2);
            testShape4.addFigure(square2);
            testShape4.addFigure(triangle2);
            List actual = new ArrayList();
            actual.add(circle2);
            actual.add(square2);
            actual.add(triangle2);
            List expected = testShape4.showFigures();
            //Then
            Assertions.assertEquals(expected, actual);
        }
    }
}

