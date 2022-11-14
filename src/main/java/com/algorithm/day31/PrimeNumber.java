package com.algorithm.day31;

import java.util.Arrays;

public class PrimeNumber {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n - 1];

        //1. 배열 만들고 1~n 만큼 값 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
        System.out.println(Arrays.toString(arr));

        //2. 소수 찾아서 제거
        for (int i = 0; i * i <= n; i++) {//배열을 전체 돌면서
            if (arr[i] != 0) {//배열 값이 0이 아닐 때
                for (int j = i * 2 + 2; j <= arr.length; j += arr[i]) {// 소수 값은 0으로 변경
                    System.out.println(j);
                    arr[j] = 0;
                    answer++;
                }
            }
            System.out.println(Arrays.toString(arr));
        }


        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        int n = 10;
        T.solution(n);
    }
}
