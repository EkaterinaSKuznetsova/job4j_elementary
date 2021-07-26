package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray3() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortNoSort() {
        int[] data = new int[] {3, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortShortArray() {
        int[] data = new int[] {3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3};
        Assert.assertArrayEquals(expected, result);
    }
}