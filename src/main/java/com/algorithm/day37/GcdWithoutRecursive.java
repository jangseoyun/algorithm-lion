package com.algorithm.day37;

import java.util.Scanner;

public class GcdWithoutRecursive {
    public static int solution(int a, int b) {
        while(a != b){
            if(a > b){
                a = a - b;
            }else if (a < b) { // 28, 42
                b = b - a;
            }
            //System.out.printf("%d, %d\n", a, b);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }
}
