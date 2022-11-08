package com.algorithm.day28;

public class BinarySearch02 {

    public static void main(String[] args) {
        int targetNum = 7;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        //중간값
        int startIdx = 0;
        int endIdx = nums.length - 1;
        int midIdx = nums.length / 2;
        int midVlaue = nums[midIdx];

        //인덱스 (시작점, 끝점) 옮기기
        if (midVlaue > targetNum) {
            startIdx = midIdx + 1;
        } else if (midVlaue < targetNum) {
            endIdx = midIdx - 1;
        } else {
            //같은지 비교하기
            //같은 경우 return
            System.out.println(midIdx);
        }

    }
}
