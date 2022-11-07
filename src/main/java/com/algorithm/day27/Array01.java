package com.algorithm.day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array01 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        if (list.size() == 0) {
            return new int[]{-1};
        }

        return answer;
    }
    public static void main(String[] args) {
        Array01 T = new Array01();
        int[] arr = {5, 9, 7, 10};
        int div = 5;
        System.out.println(T.solution(arr, div));
    }
}
