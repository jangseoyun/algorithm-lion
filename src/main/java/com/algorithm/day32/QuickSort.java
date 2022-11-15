package com.algorithm.day32;

import java.util.ArrayList;
import java.util.List;
// 1. 기준값(pivot) 뽑는 로직 구현

// 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
// List<Integer>, List<Integer>, List<Integer> 에 담아 보세요.
public class QuickSort {
    public List<Integer> solution(int[] arr) {
        int pivot = arr.length / 2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i < pivot) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }



    }
    public static void main(String[] args) {
        QuickSort T = new QuickSort();
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};

        System.out.println(T.solution(arr));
    }
}
