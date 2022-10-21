package com.algorithm.day17;

import java.util.Stack;

public class SolveBracketStack {
    public boolean solution(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if ('(' == input.charAt(i)) {
                stack.push(input.charAt(i));
                System.out.println(stack.size());
            } else if (')' == input.charAt(i)) {
                if (stack.empty()) return false;
                stack.pop();
            }
        }
        //pop peek empty
        return stack.empty();

    }
}
