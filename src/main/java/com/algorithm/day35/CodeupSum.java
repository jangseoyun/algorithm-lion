package com.algorithm.day35;

import java.util.Scanner;

public class CodeupSum {
    public static int solution(int input) {
        System.out.println(input);
        if (input == 0) {
            return 0;
        }
        return input + solution(input - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution(input));
    }
}
