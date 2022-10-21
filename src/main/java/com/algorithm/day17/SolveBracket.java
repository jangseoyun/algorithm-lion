package com.algorithm.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolveBracket {
    public boolean solution(String input) {
        //input.length -> 4
        while (input.indexOf("()") == 0) {
            input.replace("()", "");
        }
        return input.length() == 0;
    }

    public boolean solution02(String input) {
        while (input.indexOf("()") <= 0) {
            String[] splitted = input.split("\\(\\)");
            input = String.join("", splitted);
        }
        return input.length() == 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        SolveBracket T = new SolveBracket();
        System.out.println(T.solution(input));
    }
}
