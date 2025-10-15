package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Feline mockFeline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", mockFeline);
        int expectedValue = 1;
        Mockito.when(mockFeline.getKittens()).thenReturn(expectedValue);
        assertEquals(expectedValue, lion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", mockFeline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", mockFeline);
        List<String> expectedtValue = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.getFood("Хищник")).thenReturn(expectedtValue);
        assertEquals(expectedtValue, lion.getFood());
    }
}
