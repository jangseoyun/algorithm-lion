package com.algorithm.day43;

public class Dynamic01 {
    public static long solution(int n, long[] memo) {
        if (n <= 1) {
            return 1;
        }

        if (memo[n] == 0) {
            memo[n] = solution(n - 1, memo) + solution(n - 2, memo);
        }

        return memo[n];
    }
    public static void main(String[] args) {
        int n = 45;
        long r = solution(n, new long[n + 1]);
        System.out.println(r);
    }
}
