package com.algorithm.day22;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        //최대 가지고 갈 수 있는 수
        int n = nums.length / 2;

        //set의 개수와 n중에서 하나를 return
        if (set.size() < n) {
            return set.size();
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Pokemon T = new Pokemon();
        int[] arr = {3,1,2,3};
        System.out.println(T.solution(arr));
    }
}
