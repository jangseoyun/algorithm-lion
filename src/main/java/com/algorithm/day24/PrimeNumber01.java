package com.algorithm.day24;

public class PrimeNumber01 {
    public boolean solution(int[] arr) {
        boolean answer = false;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] % i != 0) {
                answer = true;
                System.out.printf("소수 : %d", arr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        PrimeNumber01 T = new PrimeNumber01();
        int[] arr = {13, 17, 19, 23};
        System.out.println(T.solution(arr));
    }
}
