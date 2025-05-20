/*
package org.example.service;
package org.example.service;


import java.util.Date;

public class CalculatorServiceTest {

    // test method for add two number

    int counter =0;
    @BeforeClass
    public static void init()
    {
        System.out.println("Before all test  cases");
        System.out.println("Started test : "+ new Date());
    }

    @Before
    public void beforeEach()
    {
        System.out.println("BEFORE EACH REST CASES::::");
        counter=0;
    }


    @Test(timeout = 2000)
    public void addTwoNumberTest() throws InterruptedException {

        for(int i=1; i<=20; i++)
        {
            counter+=i;
        }

        Thread.sleep(3000);
        System.out.println("Test for addTwoNumberTest ");
        int result = CalculatorService.addTwoNumber(11, 22);
        int expected = 33;

        System.out.println("Counter int first test  case : " +counter);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumberTest()
    {
        for(int i=1; i<=30; i++)
        {
            counter+=i;
        }

        System.out.println("test for sumAnyNumber ");
       int result = CalculatorService.sumAnyNumber(2,4,2,2);

       int expectedResult = 10;

        System.out.println("Counter int second test  case : " +counter);

        Assert.assertEquals(expectedResult,result);
    }

    @AfterClass
    public static void cleanup()
    {
        System.out.println("After all  test cases ");
        System.out.println("End test cases : " + new Date());
    }
}


*/
