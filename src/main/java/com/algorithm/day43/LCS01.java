package com.algorithm.day43;

public class LCS01 {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; //열
        String str2 = "DCABDC"; //행

        //int size = str2.length() * str1.length();
        int[][] dp = new int[str2.length()][str1.length()];

        //str2을 i로 놓고 바깥쪽에서 반복할 에정
        //str1을 j로 놓고 안쪽에서 반복할 예정
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("%s %s\n", str2.charAt(i), str1.charAt(j));
            }
        }

    }
}
