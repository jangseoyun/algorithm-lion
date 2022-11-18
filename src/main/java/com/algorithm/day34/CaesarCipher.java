package com.algorithm.day34;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        //공백제거

        //if z 이면 0부터
        for (Character c : s.toCharArray()) {
            if (c == 90 || c == 122) { //z라면?
                answer += (char) ((c - 26) + n);
            } else if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                answer += (char) (c + n);
            } else {
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CaesarCipher T = new CaesarCipher();
        String s = "a B z";
        int n = 4;
        System.out.println(T.solution(s, n));
    }
}
