package com.algorithm.day26;

import java.util.Arrays;
import java.util.Scanner;

//2, 2
//3, 4
//4, 6
//5, 8
public class RemoveMultipleOfArr02 {
    public int solution(int n) {
        int cnt = 0;

        for (int i = 2; i < n; i++) {
            System.out.print("i: " + i);
            for (int j = i; j < n; j = j + i) {//베수 출력
                System.out.println(" j: " + j);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        RemoveMultipleOfArr02 T = new RemoveMultipleOfArr02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
