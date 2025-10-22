package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class AleksTest {

    @Mock
    private Feline felineMock;

    private Aleks aleks;

    @BeforeEach
    void setUp() throws Exception {
        aleks = new Aleks(felineMock);
    }

    @Test
    void shouldCreateMaleLionAleksWithMane() {
        assertTrue(aleks.doesHaveMane(), "Алекс должен быть самцом с гривой");
    }

    @Test
    void shouldPassFelineIntoConstructor() {
        assertEquals(felineMock, aleks.getFeline(), "Feline должен быть передан в конструктор");
    }

    @Test
    void shouldReturnCorrectFriendsList() {
        List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, aleks.getFriends(), "Список друзей должен совпадать");
    }

    @Test
    void shouldReturnPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", aleks.getPlaceOfLiving(),
                "Место проживания должно быть Нью-Йоркский зоопарк");
    }

    @Test
    void shouldReturnZeroKittens() {
        assertEquals(0, aleks.getKittens(), "У Алекса не должно быть котят");
    }
}