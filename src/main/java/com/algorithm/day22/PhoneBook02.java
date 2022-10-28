package com.algorithm.day22;

import java.util.HashSet;

public class PhoneBook02 {
    public boolean solution(String[] phone_book) {
        HashSet<String> hs = new HashSet<>();
        for(var num : phone_book) {
            hs.add(num);
        }

        for (String num : phone_book) {
            for (int i = 1; i < phone_book.length; i++) {
                if (hs.contains(num.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PhoneBook02 T = new PhoneBook02();
        String[] arr = {"119", "97674223", "1195524421"};
        System.out.println(T.solution(arr));
    }
}
