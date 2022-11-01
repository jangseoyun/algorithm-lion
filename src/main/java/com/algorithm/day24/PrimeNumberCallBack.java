package com.algorithm.day24;

interface StatementStrategy{
    boolean compare(int a, int b);
}
public class PrimeNumberCallBack {

    public boolean isPrime(int n, StatementStrategy stmt) {
        // i < n
        // i < n / 2
        // i * i < n
        // Math.sqrt(n) 루트 구하기 (연산이 많다)
        for (int i = 2; stmt.compare(i, n); i++) {
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
