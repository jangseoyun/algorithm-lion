package com.algorithm.day29;

import java.util.Arrays;

interface SortStrategy {
    boolean apply(int a, int b);
}

public class SelectionSort02 {

    public int[] selectionSort(int[] arr, SortStrategy stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (stmt.apply(arr[swapIdx], arr[j])) {
                    swapIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[swapIdx];
            arr[swapIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort02 T = new SelectionSort02();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        T.selectionSort(arr, (a, b) -> a < b);//내림차순
        T.selectionSort(arr, (a, b) -> a > b);//오름차순
    }
}
