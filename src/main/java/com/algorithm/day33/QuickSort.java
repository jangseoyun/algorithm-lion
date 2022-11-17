package com.algorithm.day33;

import java.util.Arrays;

public class QuickSort {

    public int[] solution(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx) / 2];
        int leftIdx = startIdx;//0
        int rightIdx = endIdx; //7

        /*반복 구간*/
        while (leftIdx <= rightIdx) {
            while (arr[leftIdx] < pivot) {
                leftIdx++;
            }

            while (arr[rightIdx] > pivot) {
                rightIdx--;
            }

            if (leftIdx <= rightIdx) {
                int tmp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = tmp;
                leftIdx++;
                rightIdx--;
            }
        }

        System.out.println(pivot);
        System.out.println(Arrays.toString(arr));

        if (startIdx < rightIdx) solution(arr, startIdx, rightIdx);
        if (leftIdx < endIdx)solution(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        QuickSort T = new QuickSort();
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        T.solution(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.0);
    }
}
