package com.example;

import java.util.List;

public class LionAlex extends Lion {
    private final Feline feline;
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
        this.feline = feline;
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-йорский зоопарк";
    }
}
