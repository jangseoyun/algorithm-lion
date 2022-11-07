package com.algorithm.day27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Array01 {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        answer.sort(Comparator.naturalOrder());

        if (answer.size() == 0) {
            answer.add(-1);
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
