package com.tw.test;

import com.tw.MyException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MyExceptionTest {
    private MyException myException = new MyException();

    @Test
    public void test_exception_method_1() throws Exception {
        try {
            myException.isNegative(-3);
            fail("It should throw Exception");
        } catch (Exception e) {
            assertTrue(e instanceof ArithmeticException);
        }
    }
}
