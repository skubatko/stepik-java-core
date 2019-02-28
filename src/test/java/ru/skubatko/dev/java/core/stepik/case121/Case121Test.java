package ru.skubatko.dev.java.core.stepik.case121;

import org.junit.Assert;
import org.junit.Test;

public class Case121Test {

    @Test
    public void whenRun_ThenPrintOutMsg() throws Exception {
        // given

        // when
        String result = Case121.getMsg();

        // then
        Assert.assertEquals("wrong result!", Case121.MSG_TO_PRINT_OUT,result);
    }

}
