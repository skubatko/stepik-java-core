package ru.skubatko.dev.java.core.stepik.chapter4.case411;

import org.junit.Test;

public class Case411Test {

    @Test(expected = IllegalArgumentException.class)
    public void whenSqrtNegative_thenThrowException() throws Exception{
        // given
            double x = -1.0;

        // when
            Case411.sqrt(x);

        // then
    }

}
