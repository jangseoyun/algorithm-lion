package com.algorithm.day29;

import java.util.Arrays;

public class SelectionSort {
    public int[] solution(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (minValue > arr[i]) {
                    minValue = arr[i];
                    arr[i] = minValue;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(T.solution(arr));
    }
}
