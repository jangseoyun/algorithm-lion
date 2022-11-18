package com.algorithm.day34;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        //공백제거
        String str = s.replaceAll(" ", "");

        //if z 이면 0부터
        for (Character c : str.toCharArray()) {
            if (c.equals('z')) {
                answer += (char) (96 + n);
            } else if (c.equals('Z')) {
                answer += (char) (64 + n);
            } else {
                answer += (char) (c + n);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher T = new CaesarCipher();
        String s = "z";
        int n = 1;
        System.out.println(T.solution(s, n));
    }
}
