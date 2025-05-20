package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsertExample1 {
    @Test
    public void test1()
    {
        System.out.println("Testing some assertion ");

        float actual =12;
        Float expected =12f;

        // Assertions.assertEquals(expected,actual);

        int actualIntArray [] ={1,2,3,4,5};

        int expectedIntArray [] ={1,2,3,4,5};

        Assertions.assertArrayEquals(expectedIntArray,actualIntArray);





    }
}
