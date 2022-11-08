package com.algorithm.day28;

import java.util.Scanner;

public class SimpleSearch {
    public int solution(int[] arr, int k) {
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        SimpleSearch T = new SimpleSearch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(T.solution(arr, k));
    }
}
