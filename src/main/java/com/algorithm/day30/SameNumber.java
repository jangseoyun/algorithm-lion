package com.algorithm.day30;

import java.util.ArrayList;
import java.util.List;

public class SameNumber {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer.add(arr[i]);
                i++;
            } else {
                answer.add(arr[i]);
            }
        }

        for (Integer integer : answer) {
            System.out.println(integer);
        }

        return answer;
    }

    public static void main(String[] args) {
        SameNumber T = new SameNumber();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int num : T.solution(arr)) {
            System.out.println(num);
        }
    }
}
