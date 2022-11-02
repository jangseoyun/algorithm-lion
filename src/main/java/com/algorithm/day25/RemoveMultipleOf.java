package com.algorithm.day25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveMultipleOf {
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < 51; i++) {
            list.add(i);
        }
        System.out.println(list);

        return answer;
    }

    public static void main(String[] args) {
        RemoveMultipleOf T = new RemoveMultipleOf();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
