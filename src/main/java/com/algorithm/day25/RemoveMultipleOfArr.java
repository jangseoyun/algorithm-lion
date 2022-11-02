package com.algorithm.day25;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveMultipleOfArr {
    public int solution(int n){
        int cnt = 0;

        //1. 2~50까지의 배열
        int[] checks = new int[49];
        for (int i = 0; i < checks.length; i++) {
            checks[i] = i + 2;
        }

        //2. 2를 제외한 모든 배수자리에 0으로 변경
        for (int i = 2; i * i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (checks[j] % i == 0 && checks[j] > i) {
                    checks[j] = 0;
                }
            }
        }

        for (int i = 0; i < n - 2; i++) {
            if (checks[i] != 0) {
                cnt++;
            }
        }

        System.out.println(Arrays.toString(checks));

        return cnt;
    }
    public static void main(String[] args) {
        RemoveMultipleOfArr T = new RemoveMultipleOfArr();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
