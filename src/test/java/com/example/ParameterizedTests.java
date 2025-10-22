package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParameterizedTests {

    @Mock
    Feline mockFeline;

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false",
            "null, false",
            "тест, false"
    })
    public void testLionConstructor(String sex, boolean expectedresultOfMane) {

        try {
            Lion lion = new Lion(sex, mockFeline);
            assertEquals(expectedresultOfMane, lion.doesHaveMane());
        } catch (Exception e) {
            assertThrows(Exception.class, () -> new Lion(sex, mockFeline));
        }
    }

    @ParameterizedTest
    @CsvSource({
            "Травоядное",
            "Хищник",
            "Тест",
    })
    public void testGetFood(String animalKind) {

        Animal animal = new Animal();
        List<String> expectedValue = null;

        try {
            if ("Травоядное".equals(animalKind)) {
                expectedValue = List.of("Трава", "Различные растения");
            } else if ("Хищник".equals(animalKind)) {
                expectedValue = List.of("Животные", "Птицы", "Рыба");
            }
            assertEquals(expectedValue, animal.getFood(animalKind));
        } catch (Exception e) {
            assertThrows(Exception.class, () -> animal.getFood(animalKind));
        }
    }
}
