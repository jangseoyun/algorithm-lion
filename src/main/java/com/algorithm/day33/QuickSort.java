package com.algorithm.day33;

public class QuickSort {

    public int[] solution(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;//0
        int rightIdx = arr.length - 1; //7

        /*반복 구간*/
        while (arr[leftIdx] < pivot) {
            leftIdx++;
        }

        while (arr[rightIdx] > pivot) {
            rightIdx--;
        }

        int tmp = arr[leftIdx];
        arr[leftIdx] = arr[rightIdx];
        arr[rightIdx] = tmp;
        leftIdx++;
        rightIdx--;

        return arr;
    }

    public static void main(String[] args) {
        QuickSort T = new QuickSort();
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};
        T.solution(arr);
    }
}
