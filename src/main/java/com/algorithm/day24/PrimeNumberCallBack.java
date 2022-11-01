package com.algorithm.day24;

public class PrimeNumberCallBack {
    public boolean someOperation(int a, int b) {
        return a < b; //i < n
    }

    public boolean isPrime(int n) {
        // i < n
        // i < n / 2
        // i * i < n
        // Math.sqrt(n) 루트 구하기 (연산이 많다)
        for (int i = 2; someOperation(i, n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumberCallBack T = new PrimeNumberCallBack();
        boolean r = T.isPrime(13);
        System.out.println(r);
    }

}
