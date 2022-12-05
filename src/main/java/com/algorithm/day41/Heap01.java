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

        int tmp = intArry[parentIdx];
        intArry[parentIdx] = intArry[greaterIdx];
        intArry[greaterIdx] = tmp;

        return intArry;
    }

    public static void main(String[] args) {
        int[] intArry = {6, 5, 7, 8};
        int[] heap1 = makeHeap(intArry, 1);
        System.out.println(Arrays.toString(heap1));

        int[] heap2 = makeHeap(intArry, 0);
        System.out.println(Arrays.toString(heap2));
    }
}
