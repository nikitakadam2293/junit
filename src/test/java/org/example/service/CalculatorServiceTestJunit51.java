package org.example.service;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit51 {


    @BeforeAll
    public static void init()
    {
        System.out.println("This is single time logic");
    }

    @AfterAll
    public static void cleanup()
    {
        System.out.println("After all test case logic ");
    }

    @BeforeEach
    public void  eachTestCase()
    {
        System.out.println("BEFOR EACH");
    }

    @AfterEach
    public void afterTestCase()
    {
        System.out.println("AFTER EACH");

    }


    @Test
    @DisplayName("This is custom name")
    public void addTwoNumbersTest()
    {
        System.out.println("first test case");
        int actualResult =  CalculatorService.addTwoNumber(2,8);

        int expectedResult = 10;

        Assertions.assertEquals(expectedResult,actualResult,"TEST FAIL");
    }

    @Test
   public void productTwoNumberTest()
    {
       int actualResult =  CalculatorService.productTwoNumber(2,4);
       int expectedResult = 8;

        Assertions.assertEquals(expectedResult,actualResult);
        System.out.println("Find Product of two no ");

    }

        @Test
        public void divideTwoNumberTest()
        {
          double actualResult = CalculatorService.divideTwoNumber(4,8);
          double expectedResult = 0.0;

          Assertions.assertEquals(expectedResult,actualResult);

            System.out.println("Find Division of Two Number ");
        }


    @Test
    @Disabled
    public void addAnyNumbersTest()
    {
        System.out.println("Add any no test case");
        int result =  CalculatorService.sumAnyNumber(1,1,1,1);

        int expectedResult = 4;

        Assertions.assertEquals(expectedResult,result);

    }
}
