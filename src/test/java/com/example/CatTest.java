package com.example;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    public CatTest() {
    }

    @Test
    public void checkGetSound() {
        Cat cat = new Cat(new Feline());
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        Cat cat = new Cat(this.feline);
        Mockito.when(this.feline.eatMeat()).thenReturn(List.of("test"));
        Assert.assertEquals(List.of("test"), cat.getFood());
    }
}