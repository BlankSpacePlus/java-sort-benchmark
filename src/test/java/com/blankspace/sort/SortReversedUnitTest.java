package com.blankspace.sort;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.blankspace.sort.util.DataGenerator;

public class SortReversedUnitTest {

    @Test
    public void bubbleSortTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new BubbleSort();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void cocktailSortTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new CocktailSort();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void heapSortTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new HeapSort();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void insertSortTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new InsertSort();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void mergeSortIterationTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new MergeSortIteration();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void mergeSortRecursionTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new MergeSortRecursion();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void quickSortIterationTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new QuickSortIteration();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void quickSortRecursionTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new QuickSortRecursion();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void selectSortTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new SelectSort();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void shellSortTest() {
        int[] actualRecords = DataGenerator.getReversedRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = new ShellSort();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

}
