package com.algorithm.day27;

public class Harshad01 {
    public boolean solution(int x) {
        boolean answer = false;
        // 나머지가 마지막 수
        // 10으로 나누기
        int sum = 0;
        int tmp = x;
        while (tmp > 0) {
            sum += tmp % 10;
            tmp = tmp / 10;
        }
        System.out.println(sum);

        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }
    public static void main(String[] args) {
        Harshad01 T = new Harshad01();
        int input = 13;
        System.out.println(T.solution(input));
    }
}
