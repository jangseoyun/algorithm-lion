package com.algorithm.day35;

public class PrintTo100V2 {
    public static void printTo100(int n) {
        System.out.println(n);
        if (n == 100) {
            return;
        }
        printTo100(n + 1);//자기 자신 호출
    }

    public static void main(String[] args) {
        printTo100(1);
    }
}
