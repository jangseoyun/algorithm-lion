package com.ppcp.level1;

import java.util.Arrays;

public class Budget12982 {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget == 0 || budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }
}
