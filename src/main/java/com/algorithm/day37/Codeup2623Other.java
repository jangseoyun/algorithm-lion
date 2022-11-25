package com.algorithm.day37;

import java.util.Scanner;

public class Codeup2623Other {
    public static int solution(int a, int b) {
        if (b == 0) {
            return a;
        }

        return solution(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }
}
