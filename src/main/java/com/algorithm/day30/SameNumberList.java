package com.algorithm.day30;

import java.util.ArrayList;
import java.util.List;

public class SameNumberList {
    public int[] solution(int []arr) {

        List<Integer> list = new ArrayList<>();
        //1. list에 arr[0]을 넣는다
        list.add(arr[0]);

        //2. list 마지막 번호와 i 비교하여 다르면 넣는다
        for (int i = 1; i < arr.length; i++) {
            if (list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
    public static void main(String[] args) {
        SameNumberList T = new SameNumberList();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int num : T.solution(arr)) {
            System.out.println(num);
        }
    }
}
