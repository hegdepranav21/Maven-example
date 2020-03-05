package com.github.pranav.support;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationsTest {

    @Test
    public void addTest() {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(3, 4);
        Assert.assertEquals( 7, result);
    }
}
