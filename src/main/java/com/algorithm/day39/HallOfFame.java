package com.algorithm.day39;

import java.util.PriorityQueue;

public class HallOfFame {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {
            if (pq.size() < k) {
                pq.add(score[i]);
            } else if (pq.peek() < score[i]) {
                pq.poll();
                pq.add(score[i]);
            }
            System.out.println(pq.peek());
            answer[i] = pq.peek();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        System.out.println(solution(k, score));
    }
}
