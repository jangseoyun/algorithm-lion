package com.algorithm.day35;

public class ArraySum {
    public static int solution(int[] arr, int i, int answer) {
        System.out.printf("%d %d %d \n", arr.length, i, answer);
        if (arr.length == i) {
            return answer;
        }
        return solution(arr, i + 1, answer + arr[i]);
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9};
        System.out.println(solution(arr, 0, 0));
    }
}
