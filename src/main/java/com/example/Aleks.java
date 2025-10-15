package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Aleks extends Lion {

    public Aleks(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public Map<String, String> getFriends() {
        Map<String, String> friends = new LinkedHashMap<>();
        friends.put("Зебра", "Марти");
        friends.put("Бегемотиха", "Глория");
        friends.put("Жираф", "Мелман");
        return friends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}

