package com.algorithm.day36;

import java.util.Scanner;

public class StarFib {
    public static String getStars(int n) {
        if (n == 0) {
            return "";
        }
        return "*" + getStars(n - 1);
    }

    public static void print(int num) {
        if (num == 0) {
            return;
        }
        //n은 작아지지만 출력은 1부터 n까지
        print(num - 1);
        System.out.println(getStars(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        print(input);
    }
}
