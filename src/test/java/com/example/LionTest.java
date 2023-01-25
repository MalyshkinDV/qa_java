package com.example;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionTest {
    @Mock
    Feline feline;
    private final String sex;
    private final boolean hasMane;

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameters(
            name = "Sex: {0}, HasMane: {1}"
    )
    public static Object[][] setValues() {
        return new Object[][]{{"Самец", true}, {"Самка", false}};
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Lion lion = new Lion(this.sex, this.feline);
        Boolean isHasMane = lion.doesHaveMane();
        Assert.assertEquals("Positive test", this.hasMane, isHasMane);
    }

    @Test
    public void checkGetFood() throws Exception {
        Lion lion = new Lion(this.sex, this.feline);
        Mockito.when(this.feline.getFood("Хищник")).thenReturn(List.of("test"));
        Assert.assertEquals(List.of("test"), lion.getFood());
    }

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}