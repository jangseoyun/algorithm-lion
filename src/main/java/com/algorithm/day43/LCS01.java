package com.algorithm.day43;

public class LCS01 {
    public static void main(String[] args) {
        String str1 = "ABCDCBA"; //열
        String str2 = "DCABDC"; //행

        //int size = str2.length() * str1.length();
        int[][] dp = new int[str2.length() + 1][str1.length() + 1];

        //str2을 i로 놓고 바깥쪽에서 반복할 에정
        //str1을 j로 놓고 안쪽에서 반복할 예정
        for (int i = 1; i < str2.length(); i++) {
            for (int j = 1; j < str1.length(); j++) {
                System.out.printf("%s %s\n", str2.charAt(i), str1.charAt(j));
                //두개가 같으며 대각선에서 가지고 온다
                //대각선 dp[i-1][j-1]
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    //두개가 다르면 max(위 || 왼쪽)
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }


    }
}
