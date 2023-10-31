package com.blankspace.sort;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.blankspace.sort.util.DataGenerator;

public class SortRandomUnitTest {

    @Test
    public void bubbleSortTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = BubbleSort.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void cocktailSortTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = CocktailSort.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void heapSortTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = HeapSort.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void insertSortTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = InsertSort.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void mergeSortIterationTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = MergeSortIteration.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void mergeSortRecursionTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = MergeSortRecursion.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void quickSortIterationTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = QuickSortIteration.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void quickSortRecursionTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = QuickSortRecursion.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void selectSortTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = SelectSort.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

    @Test
    public void shellSortTest() {
        int[] actualRecords = DataGenerator.getRandomRecords();
        int[] expectedRecords = Arrays.copyOf(actualRecords, actualRecords.length);
        SortInterface sorter = ShellSort.getInstance();
        sorter.sort(actualRecords);
        Arrays.sort(expectedRecords);
        Assertions.assertArrayEquals(expectedRecords, actualRecords);
    }

}
