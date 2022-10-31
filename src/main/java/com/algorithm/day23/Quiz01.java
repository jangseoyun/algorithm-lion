package com.algorithm.day23;

import java.util.Arrays;

/**
 * 모의고사 알고리즘
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬
 */

public class Quiz01  {
    public int[] solution(int[] result) {
        int[] answer = new int[3];//3명의 학생 시험 결과

        int[] student01 = {1, 2, 3, 4, 5};
        int[] student02 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student03 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        //각 학생 시험 결과
        for (int i = 0; i < result.length; i++) {
            if (result[i] == student01[i % student01.length]) {//1번 학생 결과
                answer[0]++;
            }

            if (result[i] == student02[i % student02.length]) {
                answer[1]++;
            }

            if (result[i] == student03[i % student03.length]) {
                answer[2]++;
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
    public static void main(String[] args) {
        Quiz01 T = new Quiz01();
        int[] result = {1, 2, 3, 4, 5};
        System.out.println(T.solution(result));
    }
}
