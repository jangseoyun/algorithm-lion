package com.algorithm.day35;

import java.util.Scanner;

public class NumSum {
    public static Long solution(Long input) {
        if (input <= 0) {
            return 0L;
        }
        //나머지
        return (input % 10) + solution(input / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long input = sc.nextLong();
        System.out.println(solution(input));
    }
}
