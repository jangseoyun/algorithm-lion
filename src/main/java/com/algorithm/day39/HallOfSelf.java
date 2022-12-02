package com.algorithm.day39;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HallOfSelf {//k 점수 목록 수, score 전체 점수
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {
            if (queue.size() < k) {
                queue.add(score[i]);
            } else if (queue.peek() < score[i]) {//점수 체크 후 빼고 넣기
                queue.poll();
                queue.add(score[i]);
            }
            answer[i] = queue.peek();
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        System.out.println(Arrays.toString(solution(k, score)));
    }
}
