package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = thePizza.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        // When
        String description = thePizza.getDescription();
        // Then
        assertEquals("Your Pizza: Tomato Sauce, Cheese", description);
    }
    @Test
    public void testBasicPizzaOrderWithIngredientsCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ForestLoverDecorator(thePizza);
        thePizza = new WeirdDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        BigDecimal calculatedCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(27), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderWithExtraIngredientsDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ForestLoverDecorator(thePizza);
        thePizza = new WeirdDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Your Pizza: Tomato Sauce, Cheese, Mushroom, Pineapple, ExtraCheese", description);
    }
}
