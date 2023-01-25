package com.example;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {
    public ExceptionTest() {
    }

    @Test
    public void checkDoesHaveManeException() {
        Assert.assertThrows(Exception.class, () -> {
            new Lion("sex", new Feline());
        });
    }

    @Test
    public void checkEatMeatException() {
        Assert.assertThrows(Exception.class, () -> {
            (new Feline()).getFood("unknownAnimal");
        });
    }
}