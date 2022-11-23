package com.algorithm.day35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers { // 재귀 사용하지 않음
    public static int solution(int n) {
        if (n == 1 | n == 2) {
            return 1;
        }

        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int j = 2; j < n; j++) {
            fibonacciNums.add(fibonacciNums.get(j - 1) + fibonacciNums.get(j - 2));
        }

        return fibonacciNums.get(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        solution(input);
    }
}
