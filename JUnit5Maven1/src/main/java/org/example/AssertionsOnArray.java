package org.example;

import java.util.Arrays;

public class AssertionsOnArray
{
    public static int[] sortArray(int[] arr)
    {
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
