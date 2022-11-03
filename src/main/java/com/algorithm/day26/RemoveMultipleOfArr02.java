package com.algorithm.day26;

import java.util.Arrays;
import java.util.Scanner;

//2, 2
//3, 4
//4, 6
//5, 8
public class RemoveMultipleOfArr02 {
    public int solution(int n) {
        n = 50; // n은 50개
        int[] nums = new int[n - 1]; // n-1개 만큼 2~50개까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks 생성
        Arrays.fill(checks, true); //checks를 true로 초기와 : 기본값 true

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;//2~50까지
        }
    }

    public static void main(String[] args) {
        RemoveMultipleOfArr02 T = new RemoveMultipleOfArr02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
