package com.algorithm.day31;

public class PrimeNumber {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];

        //1. 배열 만들고 n 만큼 생성
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        int n = 10;
        T.solution(n);
    }
}
