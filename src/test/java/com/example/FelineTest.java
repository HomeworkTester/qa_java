package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Spy
    Feline felineSpy;
    Feline feline;

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineSpy.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = felineSpy.eatMeat();
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
        int expectedValue = 1;
        Mockito.when(felineSpy.getKittens(1)).thenReturn(expectedValue);
        assertEquals(expectedValue, felineSpy.getKittens());
    }

    @Test
    public void testGetKittensWithArgument() {
        feline = new Feline();
        int expectedValue = 1;
        assertEquals(expectedValue, feline.getKittens(expectedValue));
    }
}
