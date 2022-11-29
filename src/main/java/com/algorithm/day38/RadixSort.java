package com.algorithm.day38;

import java.util.Arrays;
import java.util.HashSet;

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
        int[] redixArr = new int[10];
        Arrays.fill(redixArr, -1);//배열 같은 값 초기화

        for (int idx : arr) {
            redixArr[idx] = idx;
        }

        System.out.println(Arrays.toString(redixArr));
        return redixArr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 9, 1, 0};
        solution(arr);
        getDigits(arr);
    }
}
