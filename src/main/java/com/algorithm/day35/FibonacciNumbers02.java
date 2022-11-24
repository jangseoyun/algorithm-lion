package com.algorithm.day35;

import java.util.Scanner;

public class FibonacciNumbers02 { // 재귀 사용하지 않음
    public static int solution(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return solution(num - 2) + solution(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution(input));
    }
}
