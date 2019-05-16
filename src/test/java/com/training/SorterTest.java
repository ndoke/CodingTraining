package com.training;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SorterTest {
    private Sorter sorter = new Sorter();
    private int input[][];
    private int expected[][];

    @Before
    public void setUp() {
        input = new int[][]{null, {}, {8, 0, -1, 9, 3, 5, 2}, {8, 1, 1, 9, 1, 5, 2}};
        expected = new int[][]{null, {}, {-1, 0, 2, 3, 5, 8, 9}, {1, 1, 1, 2, 5, 8, 9}};
    }

    @Test
    public void bubbleSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doBubbleSort(input[i]);
            Assert.assertArrayEquals(expected[i], input[i]);
        }
    }

    @Test
    public void selectionSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doSelectionSort(input[i]);
            Assert.assertArrayEquals(expected[i], input[i]);
        }
    }

    @Test
    public void insertionSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doInsertionSort(input[i]);
            Assert.assertArrayEquals(expected[i], input[i]);
        }
    }

    @Test
    public void quickSort() {
        for (int i = 0; i < input.length; i++) {
            sorter.doQuickSort(input[i]);
            Assert.assertArrayEquals(expected[i], input[i]);
        }
    }
}
