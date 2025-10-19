package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFamily() {
        feline = new Feline();
        String expectedValue = "Кошачьи";
        assertEquals(expectedValue, feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        feline = new Feline();
        int expectedValue = 1;
        int actualValue = feline.getKittens();
        assertEquals(expectedValue, actualValue, "Метод getKittens() должен возвращать 1 по умолчанию");
    }

    @Test
    public void testGetKittensWithArgument() {
        feline = new Feline();
        int expectedValue = 1;
        assertEquals(expectedValue, feline.getKittens(expectedValue));
    }
}