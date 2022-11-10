package com.algorithm.day30;

import java.util.Stack;

public class SameNumberStack {
    public int[] solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i > 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
    public static void main(String[] args) {
        SameNumberStack T = new SameNumberStack();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        for (int num : T.solution(arr)) {
            System.out.println(num);
        }
    }
}
