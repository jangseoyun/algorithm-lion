package com.algorithm.day28;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BinarySearch {
    public int solution(int[] nums) {
        int answer = -1;
        int start = 0;
        int finished = nums.length;
        int target = 7;

        for (int i = start; i < finished; i++) {
            int middle = (finished / 2);
            if (middle == target) {
                return target;
            } else if (middle < target) {
                start = middle;
            } else if (middle > target) {
                finished = middle;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println(T.solution(nums));
    }
}
