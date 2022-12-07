package com.algorithm.day42;

import java.util.PriorityQueue;
import java.util.Queue;

public class Scoville02 {
    public static int solution(int[] scoville, int k) {
        int answer = 0;
        int make = 0;

        Queue<Integer> pq = new PriorityQueue<>();
        for (int num : scoville) {
            pq.add(num);
        }
        System.out.println(pq);
        while (pq.peek() < k) {
            if (pq.size() == 1) {
                return -1;
            }
            make = pq.poll() + (pq.poll() * 2);
            System.out.println("make: " + make);
            pq.add(make);
            System.out.println(pq);
            answer++;
            System.out.println("answer: " + answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        solution(scoville, k);
    }
}
