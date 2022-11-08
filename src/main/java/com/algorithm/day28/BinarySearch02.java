package com.algorithm.day28;

public class BinarySearch02 {

    public static void main(String[] args) {
        int targetNum = 7;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        //중간값
        int startIdx = 0;
        int endIdx = nums.length - 1;

        while (startIdx <= endIdx) {
            int midIndex = (startIdx + endIdx) / 2; // start:0 end:10
            System.out.println(midIndex);

            if (midIndex == targetNum) {
                System.out.printf("%d는 %d에 있습니다.", targetNum, midIndex);
                break;
            } else if (midIndex > targetNum) {
                // ---3---5----- 중간값 이상은 모두 버립니다. 5포함.
                endIdx = midIndex - 1;
            } else if (midIndex < targetNum) {
                // ------5---7-- 중간값 이하는 모두 버립니다. 5포함.
                startIdx = midIndex + 1;
            }
        }

    }
}
