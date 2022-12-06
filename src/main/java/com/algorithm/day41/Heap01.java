package com.algorithm.day41;

import java.util.Arrays;

public class Heap01 {
    public static int[] makeHeap(int[] intArry, int parentIdx) {

        int leftIdx = (2 * parentIdx) + 1; //2N + 1
        int rightIdx = (2 * parentIdx) + 2; //2N + 2
        int greaterIdx = parentIdx;
        System.out.println("leftIdx: " + leftIdx);
        System.out.println("rightIdx: " + rightIdx);

        //왼쪽이 부모보다 크면? 6 7 5 greatorIdx = leftIdx
        if (leftIdx < intArry.length && intArry[leftIdx] > intArry[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        //오른쪽이 greator보다 크면
        if (rightIdx < intArry.length && intArry[rightIdx] > intArry[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        //swap
        if (parentIdx != greaterIdx) {
            int tmp = intArry[parentIdx];
            intArry[parentIdx] = intArry[greaterIdx];
            intArry[greaterIdx] = tmp;
            makeHeap(intArry, greaterIdx);
        }

        return intArry;
    }

    public static void main(String[] args) {
        int[] intArry = {6, 5, 7, 8};
        intArry = new int[]{5, 8, 4, 7, 3, 2, 9, 6, 7,};
        for (int i = (intArry.length - 2) / 2; i >= 0; i--) {
            intArry = makeHeap(intArry, i);
            System.out.println(Arrays.toString(intArry));
        }
    }
}
