package com.algorithm.day37;

import java.util.Scanner;

public class Codeup2623 {
    public static int solution(int a, int b) {
        if (a > b) {
            return solution(a - b, b);
        } else if (a < b) {
            return solution(a, b - a);
        } else if (a == b) {
            return a;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }
}
