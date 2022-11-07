package com.algorithm.day27;

import java.util.PriorityQueue;

public class Array02 {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        int idx = 0;
        while (!list.isEmpty()) {
            answer[idx++] = list.poll();
        }

        return answer;
    }
    public static void main(String[] args) {
        Array02 T = new Array02();
        int[] arr = {5, 9, 7, 10};
        int div = 5;
        System.out.println(T.solution(arr, div));
    }
}
