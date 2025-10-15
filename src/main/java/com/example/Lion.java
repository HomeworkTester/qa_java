package com.example;

import java.util.List;

public class Lion {

    private final FelineInterface feline;
    private final boolean hasMane;

    public Lion(String sex, FelineInterface feline) throws Exception {
        if (!"Самец".equals(sex) && !"Самка".equals(sex)) {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.feline = feline;
        this.hasMane = "Самец".equals(sex);
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    public FelineInterface getFeline() {
        return feline;
    }
}