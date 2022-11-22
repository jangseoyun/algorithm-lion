package com.algorithm.day35;

import java.util.Scanner;

public class PrintStar {
    public static void print(int input) {
        System.out.print("*");
        if (input == 1) {
            return;
        }
        print(input - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        print(input);
    }
}
