package com.algorithm.day33;

import java.util.Arrays;

public class QuickSort02 {

    public int[] solution(int[] arr, int statIdx, int endIdx) {

        if (statIdx >= endIdx) {
            return arr;
        }

        int pivot = arr[(statIdx + endIdx) / 2];
        int leftIdx = statIdx;
        int rightIdx = endIdx;
        System.out.println(pivot);
        System.out.println(Arrays.toString(arr));

        while (leftIdx < rightIdx) {
            //좌
            while (arr[leftIdx] < pivot) {
                leftIdx++;
                System.out.println("arr left"+arr[leftIdx]);
            }

            //우
            while (arr[rightIdx] > pivot) {
                rightIdx--;
                System.out.println("arr right"+arr[rightIdx]);
            }

            //한 바퀴 돌았을 때
            if (leftIdx <= rightIdx) {
                int tmp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = tmp;
            }
            System.out.println(Arrays.toString(arr));
        }

        //파티셔닝하여 두곳으로 나눈 그룹
        solution(arr, statIdx, rightIdx - 1);//좌
        solution(arr, rightIdx + 1, endIdx);//우

        return arr;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        QuickSort02 T = new QuickSort02();
        int[] arr = {7, 3, 2, 1, 5, 4, 6};

        T.solution(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.0);
    }
}
