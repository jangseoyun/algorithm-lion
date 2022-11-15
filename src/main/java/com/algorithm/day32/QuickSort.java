package com.algorithm.day32;

import java.util.ArrayList;
import java.util.List;
// 1. 기준값(pivot) 뽑는 로직 구현

// 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
// List<Integer>, List<Integer>, List<Integer> 에 담아 보세요.
public class QuickSort {

    //list 합치기
    public List<Integer> merge(List<Integer> left, List<Integer> mid, List<Integer> right) {
        List<Integer> answer = new ArrayList<>();
        answer.addAll(left);
        answer.addAll(mid);
        answer.addAll(right);
        return answer;
    }

    public List<Integer> solution(List<Integer> arr) {
        int pivot = arr.get(arr.size() / 2); //5
        List<Integer> left = new ArrayList<>(); //5
        List<Integer> right = new ArrayList<>(); //20, 18, 19, 25, 40, 50
        List<Integer> mid = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else if (arr.get(i) > pivot) {
                right.add(arr.get(i));
            } else {
                mid.add(arr.get(i));
            }
        }

        //list를 합치는 연산
        return merge(left, mid, right);
    }

    public static void main(String[] args) {
        QuickSort T = new QuickSort();
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        System.out.println(T.solution(al));
    }
}
