package com.algorithm.day25;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveMultipleOfArr {
    public int solution(int n){

        //1. 2~50까지의 배열
        int[] checks = new int[49];
        for (int i = 0; i < checks.length; i++) {
            checks[i] = i + 2;
        }
        System.out.println(Arrays.toString(checks));

        //2. 2를 제외한 모든 배수자리에 0으로 변경
        for (int i = 0; i < n; i++) {

        }

        //3.
        return checks.length;
    }
    public static void main(String[] args) {
        RemoveMultipleOfArr T = new RemoveMultipleOfArr();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
