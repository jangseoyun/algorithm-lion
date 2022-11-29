package com.algorithm.day38;

import java.util.Arrays;

public class RadixSort {
    public static int[] solution(int[] arr) {
        int[] redixArr = new int[10];
        Arrays.fill(redixArr, -1);//배열 같은 값 초기화

        for (int idx : arr) {
            redixArr[idx] = idx;
        }

        System.out.println(Arrays.toString(redixArr));

        return redixArr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 0};
        solution(arr);
    }
}
