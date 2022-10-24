package com.algorithm.day18;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumSlice2 {
    private int[] arr = {};

    public int getKthNum(int[] command) {
        int frIdx = command[0];
        int toIdx = command[1];
        int nth = command[2];
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();//큐를 통해 sort를 따로 넣지 않음
        for (int i = frIdx - 1; i < toIdx; i++) {
            pq.add(arr[i]);//from~to
        }

        for (int i = 0; i < nth; i++) {
            result = pq.poll();//값을 꺼낼 때 정렬되는 것
        }
        return result;
    }

    public int[] solution(int[] arr, int[][] commands) {
        this.arr = arr;
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthNum(commands[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        KthNumSlice2 T = new KthNumSlice2();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(T.solution(arr, commands)));
    }

}
