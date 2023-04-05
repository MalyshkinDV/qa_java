package com.example;

import org.junit.Assert;
import org.junit.Test;

public class FelineTest {
    Feline feline = new Feline();

    public FelineTest() {
    }

    @Test
    public void checkEatMeat() throws Exception {
        Assert.assertEquals(this.feline.getFood("Хищник"), this.feline.eatMeat());
    }

    @Test
    public void checkGetFamily() {
        Assert.assertEquals("Кошачьи", this.feline.getFamily());
    }

    @Test
    public void checkGetKittens() {
        Assert.assertEquals(1L, (long)this.feline.getKittens());
    }
}
