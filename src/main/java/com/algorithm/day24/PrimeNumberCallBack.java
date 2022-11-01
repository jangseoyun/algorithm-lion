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
            System.out.println(i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumberCallBack T = new PrimeNumberCallBack();
        boolean r1 = T.isPrime(13, (a, b) -> a < b);
        boolean r2 = T.isPrime(17, (a, b) -> a < b / 2);
        boolean r3 = T.isPrime(19, (a, b) -> a * a < b);
        System.out.printf("%s %s %s", r1, r2, r3);
    }

}
