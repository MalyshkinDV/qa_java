package com.example;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Mock
    Feline feline;

    public LionAlexTest() {
    }

    @Test
    public void checkGetKittens() throws Exception {
        LionAlex alex = new LionAlex(this.feline);
        Mockito.when(this.feline.getKittens(0)).thenReturn(3);
        Assert.assertEquals(3L, (long)alex.getKittens());
    }

    @Test
    public void checkGetFriends() throws Exception {
        LionAlex alex = new LionAlex(this.feline);
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void checkGetPlaceOfLiving() throws Exception {
        LionAlex alex = new LionAlex(this.feline);
        Assert.assertEquals("Нью-йорский зоопарк", alex.getPlaceOfLiving());
    }
}