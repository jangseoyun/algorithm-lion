package com.algorithm.day38;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;

public class RadixSort {
    public static HashSet getDigits(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        //최대 자릿수 구하고 set을 통해 중복 제거
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                hash.add(1);
            } else {
                hash.add((int) (Math.log10(arr[i]) + 1));
            }
        }
        System.out.println(hash);

        //set 배열에 넣고 정렬
        int[] answer = new int[hash.size()];
        int idx = 0;
        for (Integer num : hash) {
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return hash;
    }

    public static int[] solution(int[] arr) {
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>();
        }

        //자릿수에 맞게 queue에 넣기 1, 10, 100...
        for (int i = 0; i < arr.length; i++) {
            int digit = (int) Math.pow(10, 0);
            queueArr[Math.floorDiv(arr[i], digit) % 10].add(arr[i]);
        }

        return new int[10];
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 0, 20};
        solution(arr);
        getDigits(arr);
    }
}
