package com.algorithm.day35;

import java.util.Scanner;

public class Factorial {
    public static int solution(int num) {
        if (num <= 1) {
            return num;
        }
        return num * solution((num - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(solution(input));
    }
}
