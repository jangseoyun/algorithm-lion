package com.algorithm.day35;

public class PrintTo100V2 {
    public static void printTo100(int n) {
        System.out.println(n);
        printTo100(n);
    }
    public static void main(String[] args) {
        printTo100(1);
    }
}
