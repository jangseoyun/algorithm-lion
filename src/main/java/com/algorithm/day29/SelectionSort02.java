package com.algorithm.day29;

import java.util.Arrays;

public class SelectionSort02 {

    public int[] solution(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort02 T = new SelectionSort02();
        int[] arr = {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        System.out.println(T.solution(arr));
    }
}
