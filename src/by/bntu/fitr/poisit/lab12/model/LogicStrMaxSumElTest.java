package by.bntu.fitr.poisit.lab12.model;

import org.junit.Assert;
import org.junit.Test;

public class LogicStrMaxSumElTest {
    @Test
    public void findSrtMaxSumEl() {
        int testArray[][] = {{3, 1, 7}, {11, 9, 21}, {5, 19, 15}};
        Assert.assertEquals(1, LogicStrMaxSumEl.findSrtMaxSumEl(testArray));
    }

    @Test
    public void findStrMaxSumEl(){
        int testArray[][] = new int[0][0];
        Assert.assertEquals(0, LogicStrMaxSumEl.findSrtMaxSumEl(testArray));
    }
}