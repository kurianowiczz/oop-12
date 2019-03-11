package by.bntu.fitr.poisit.lab12.model;

import org.junit.Assert;
import org.junit.Test;

public class LogicSrtSubAverageTest {
    @Test
    public void findAverage() {
        int testArray[][] = {{3, 4, 5}, {6, 7, 8}, {9, 1, 2}};
        int expectedArray[][] = {{-2, -1, 0}, {1, 2, 3}, {4, -4, -3}};
        Assert.assertArrayEquals(expectedArray, LogicSrtSubAverage.findAverage(testArray));
    }

    @Test
    public void findAvarage(){
        int testArray[][] = new int[0][0];
        int expectedArray[][] = new int[0][0];
        Assert.assertArrayEquals(expectedArray, LogicSrtSubAverage.findAverage(testArray));
    }
}