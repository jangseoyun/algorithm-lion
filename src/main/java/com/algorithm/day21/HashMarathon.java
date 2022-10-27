package com.algorithm.day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HashMarathon {
    class Person {
        private String key;
        private Integer value;

        public Person(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size;
    private List<Person>[] participant;

    public HashMarathon() {
        this.size = 100_000;
        this.participant = new ArrayList[size];
    }

    public int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }
        return sum % participant.length;
    }

    public void insert(String key, int value) {

    }
    public static void main(String[] args) {
        HashMarathon T = new HashMarathon();
        Scanner sc = new Scanner(System.in);
        String[] par = {"leo", "kiki", "eden"};

    }
}
