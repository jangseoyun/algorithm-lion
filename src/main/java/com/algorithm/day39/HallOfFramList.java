package com.algorithm.day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFramList {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int minValue = score[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            //최소값
            if (minValue > score[i]) {
                minValue = score[i];
            }

            if (list.size() < k) {
                list.add(score[i]);
            } else if (minValue < score[i]) {
                list.remove(0);
                list.add(score[i]);
                Collections.sort(list);
            }
            System.out.println(list.get(0));
            answer[i] = list.get(0);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        System.out.println(Arrays.toString(solution(k, score)));
    }
}
