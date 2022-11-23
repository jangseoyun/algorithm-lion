package com.algorithm.day35;

public class ArraySum {
    public static int solution(int[] arr, int i) {
        System.out.printf("%d %d \n", arr.length, i);
        if (arr.length == i) {
            return 0;
        }
        return arr[i] + solution(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9};
        System.out.println(solution(arr, 0));
    }
}
