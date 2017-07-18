package com.tw.test;

import com.tw.MyException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MyExceptionTest {
    private MyException myException = new MyException();
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_exception_method_1() throws Exception {
        try {
            myException.isNegative(-3);
            fail("It should throw Exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException);
            assertEquals(e.getMessage(), "Number shouldn't be negative");
        }
    }

    @Test(expected = ArithmeticException.class)
    public void test_exception_method_2() throws Exception {
        myException.isNegative(-3);
    }

    @Test
    public void test_exception_method_3() throws Exception {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Number shouldn't be negative");
        myException.isNegative(-3);
    }
}
